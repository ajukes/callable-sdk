package io.callable.sdk.dto;

import io.callable.sdk.dto.verbs.CallableHangup;
import io.callable.sdk.dto.verbs.CallableTarget;
import io.callable.sdk.dto.verbs.CallableVerb;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class VoiceCall {
    private String callerId;
    private CallableTarget target;
    private List<CallableVerb> verbs;

    public VoiceCall(String callerId, CallableTarget target, List<CallableVerb> verbs) {
        this.callerId = callerId;
        this.target = target;
        this.verbs = verbs;
    }

    public VoiceCall(CallableTarget target, List<CallableVerb> verbs) {
        this.target = target;
        this.verbs = verbs;
    }

    public VoiceCall(CallableTarget target) {
        this.target = target;
        this.verbs = Collections.singletonList(new CallableVerb(new CallableHangup("no-reason")));
    }
}
