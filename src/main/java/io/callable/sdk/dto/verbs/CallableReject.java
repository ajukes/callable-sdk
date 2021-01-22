package io.callable.sdk.dto.verbs;

import io.callable.sdk.enums.RejectType;
import lombok.Getter;

@Getter
public class CallableReject {
    private RejectType rejectType;
    private String reason;

    public CallableReject(RejectType rejectType, String reason) {
        this.rejectType = rejectType;
        this.reason = reason;
    }

    public CallableReject(RejectType rejectType) {
        this.rejectType = rejectType;
    }

    public CallableVerb verb() {
        return new CallableVerb(this);
    }
}
