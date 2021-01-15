package io.callable.sdk.dto.verbs;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
public class CallableDial {

    private String callerId;
    private Integer timeLimit;
    private Integer timeout;
    private List<CallableTarget> targets;
    private Record record;

    public CallableDial(String callerId, Integer timeLimit, Integer timeout, List<CallableTarget> targets, Record record) {
        this.callerId = callerId;
        this.timeLimit = timeLimit;
        this.timeout = timeout;
        this.targets = targets;
        this.record = record;
    }
}
