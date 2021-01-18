package io.callable.sdk.dto.integration;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IntegrationPutRequest {
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
