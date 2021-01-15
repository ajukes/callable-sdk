package io.callable.sdk.dto.verbs;

import lombok.Getter;

@Getter
public class CallableHangup {

    private String reason;

    public CallableHangup(String reason) {
        this.reason = reason;
    }
}
