package io.callable.sdk.dto.verbs;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CallableDial {
    private String callerId;
    private Integer timeLimit;
    private Integer timeout;
    private List<CallableTarget> targets;
    private Record record;

    public CallableVerb verb() {
        return new CallableVerb(this);
    }
}
