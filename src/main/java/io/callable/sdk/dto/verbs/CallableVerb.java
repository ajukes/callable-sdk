package io.callable.sdk.dto.verbs;

import lombok.Getter;

@Getter
public class CallableVerb {

    private CallableDial dial;
    private CallableSay say;
    private CallablePlay play;
    private CallableGather gather;
    private CallableReject reject;
    private CallableHangup hangup;
    private CallableRedirect redirect;
    private CallableTag tag;

    public CallableVerb(CallableDial dial) {
        this.dial = dial;
    }

    public CallableVerb(CallableSay say) {
        this.say = say;
    }

    public CallableVerb(CallablePlay play) {
        this.play = play;
    }

    public CallableVerb(CallableGather gather) {
        this.gather = gather;
    }

    public CallableVerb(CallableReject reject) {
        this.reject = reject;
    }

    public CallableVerb(CallableHangup hangup) {
        this.hangup = hangup;
    }

    public CallableVerb(CallableRedirect redirect) {
        this.redirect = redirect;
    }

    public CallableVerb(CallableTag tag) {
        this.tag = tag;
    }
}
