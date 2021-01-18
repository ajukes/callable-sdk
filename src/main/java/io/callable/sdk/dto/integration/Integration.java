package io.callable.sdk.dto.integration;

import lombok.Getter;

@Getter
public class Integration {
    private String id;
    private String app;
    private String url;
    private String authType;
    private String apiKeyName;
    private String apiKeyValue;
    private String apiSecretName;
    private String apiSecretValue;
    private String endpoint;
    private String method;
    private Integer priority;
}
