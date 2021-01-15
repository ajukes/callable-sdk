package io.callable.sdk;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.ToString;

import java.time.Instant;

@Getter
@ToString
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class CallableTokenResponse {
    private String accessToken;
    private String refreshToken;
    private long refreshExpiresIn;
    private long expiresIn;

    Instant getExpiresInInstant() {
        return Instant.now().plusSeconds(refreshExpiresIn - 10);
    }

    Instant getRefreshExpiresInInstant() {
        return Instant.now().plusSeconds(expiresIn - 10);
    }
}
