package io.callable.sdk;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.callable.sdk.exceptions.AuthenticationException;
import io.callable.sdk.exceptions.FileToLargeException;
import io.callable.sdk.exceptions.NullBodyException;
import io.callable.sdk.exceptions.ResponseStatusException;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Slf4j
class CallableHTTPClient {

    private static final String URL_VERSION = "/api/v1/";
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static CallableHTTPClient INSTANCE;

    private final String url;
    private final String wsUrl;
    private final String username;
    private final String password;
    private final OkHttpClient client;
    private final ObjectMapper objectMapper;

    private CallableTokenResponse tokenResponse;

    static CallableHTTPClient getInstance() {
        if (INSTANCE == null) {
            throw new AssertionError("INSTANCE cannot be initiated");
        }
        return INSTANCE;
    }

    static CallableHTTPClient getInstance(String url, String username, String password) {
        if (INSTANCE == null) {
            INSTANCE = new CallableHTTPClient(url, username, password);
        }
        return INSTANCE;
    }

    private CallableHTTPClient(String url, String username, String password) {
        this.url = url + URL_VERSION;
        this.wsUrl = url + "/app/";
        this.username = username;
        this.password = password;
        this.client = new OkHttpClient();
        this.objectMapper = new ObjectMapper()
//                .setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        authorise();
    }

    private void checkToken() {
        if (Instant.now().isAfter(tokenResponse.getRefreshExpiresInInstant())) {
            authorise();
        } else if (Instant.now().isAfter(tokenResponse.getExpiresInInstant())) {
            refresh();
        }
    }

    private void authorise() {
        try {

            RequestBody formBody = new FormBody.Builder()
                    .add("username", username)
                    .add("password", password)
                    .build();

            Request request = new Request.Builder()
                    .url(url + "oauth/authorize")
                    .post(formBody)
                    .build();

            updateTokenResponse(request);

        } catch (IOException ex) {
            log.error("IO Error on authorise", ex);
        }
    }

    private void refresh() {
        try {

            RequestBody formBody = new FormBody.Builder()
                    .add("token", tokenResponse.getRefreshToken())
                    .build();

            Request request = new Request.Builder()
                    .url(url + "oauth/refresh")
                    .post(formBody)
                    .build();

            updateTokenResponse(request);

        } catch (IOException ex) {
            log.error("IO Error on authorise", ex);
        }
    }

    private void updateTokenResponse(Request request) throws IOException {
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String strResp = Optional.of(response)
                        .map(Response::body)
                        .map(this::getString)
                        .orElseThrow(AuthenticationException::new);

                tokenResponse = objectMapper.readValue(strResp, CallableTokenResponse.class);
            } else {
                log.error("Non Successful response type {}", response);
                throw new AuthenticationException();
            }
        }
    }

    private String getString(ResponseBody body) {
        try {
            return body.string();
        } catch (IOException e) {
            log.error("IO Error on response body");
            return null;
        }
    }


    public <T> T list(String path, Class<?> clazz) {

        try {
            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .get()
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    JavaType type = objectMapper.getTypeFactory().constructCollectionType(List.class, clazz);
                    return map(response, type);
                }
                throw new ResponseStatusException(response.code(), response.body().string());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "GET", path, ex.getMessage()));
        }
    }

    public <T> T get(String path, Class<T> clazz) {

        try {
            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .get()
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    JavaType type = objectMapper.getTypeFactory().constructType(clazz);
                    return map(response, type);
                }
                throw new ResponseStatusException(response.code(), response.body().string());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "GET", path, ex.getMessage()));
        }

    }

    public <T> T post(String path, Object obj, Class<T> clazz) {
        try {
            String json = objectMapper.writeValueAsString(obj);
            RequestBody body = RequestBody.create(json, JSON);
            log.info(json);
            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    JavaType type = objectMapper.getTypeFactory().constructType(clazz);
                    return map(response, type);
                }
                throw new ResponseStatusException(response.code(), response.body().string());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "POST", path, ex.getMessage()));
        }
    }

    public <T> T put(String path, Object obj, Class<T> clazz) {
        try {
            String json = objectMapper.writeValueAsString(obj);
            RequestBody body = RequestBody.create(json, JSON);
            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .put(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    JavaType type = objectMapper.getTypeFactory().constructType(clazz);
                    return map(response, type);
                }
                throw new ResponseStatusException(response.code(), response.body().string());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "PUT", path, ex.getMessage()));
        }
    }

    public void remove(String path) {
        try {
            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .delete()
                    .build();
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    //do nothing
                }
                throw new ResponseStatusException(response.code(), response.body().string());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "POST", path, ex.getMessage()));
        }
    }

    private <T> T map(Response response, JavaType type) throws JsonProcessingException {
        String strResp = Optional.of(response)
                .map(Response::body)
                .map(this::getString)
                .orElseThrow(NullBodyException::new);


        return objectMapper.readValue(strResp, type);
    }


    public boolean upload(String path, File file) {
        try {

            if (file.length() > 104857600) {
                throw new FileToLargeException();
            }

            String mimeType = Files.probeContentType(file.toPath());

            RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
                    .addFormDataPart("file", file.getName(), RequestBody.create(MediaType.parse(mimeType), file))
                    .build();

            Request request = new Request.Builder()
                    .url(url + path)
                    .header("Authorization", "Bearer " + tokenResponse.getAccessToken())
                    .post(requestBody)
                    .build();

            try (Response response = client.newCall(request).execute()) {
                if (response.isSuccessful()) {
                    return true;
                }
                throw new ResponseStatusException(response.code());
            }

        } catch (IOException ex) {
            throw new ResponseStatusException(String.format("Exception occurred in %s %s - ERROR = %s", "POST/UPLOAD", path, ex.getMessage()));
        }
    }
}
