package io.callable.sdk;

public final class CallableClientBuilder {

    private String username;
    private String password;
    private String url;

    private CallableClientBuilder() {
    }

    public static CallableClientBuilder builder() {
        return new CallableClientBuilder();
    }

    public CallableClientBuilder withUrl(String url) {
        this.url = url;
        return this;
    }

    public CallableClientBuilder withUsername(String username) {
        this.username = username;
        return this;
    }

    public CallableClientBuilder withPassword(String password) {
        this.password = password;
        return this;
    }

    public CallableClient build() {
        return new CallableClientImpl(url, username, password);
    }
}
