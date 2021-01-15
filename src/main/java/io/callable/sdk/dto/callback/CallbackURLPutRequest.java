package io.callable.sdk.dto.callback;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CallbackURLPutRequest {
    private String id;
    private String app;
    private String url;
    private String method;
    private Integer priority;
    private String authType;
    private String apiKeyName;
    private String apiKeyValue;
    private String apiSecretName;
    private String apiSecretValue;
    private String endpoint;
}
