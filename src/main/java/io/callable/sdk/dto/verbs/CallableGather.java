package io.callable.sdk.dto.verbs;


import io.callable.sdk.enums.GoogleSpeechRecognizerLanguage;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;


@Getter
@Builder
public class CallableGather {
    private Set<String> input;
    private String finishOnKey;
    private Integer numDigits;
    private Integer timeout;
    private CallableSay say;
    private CallablePlay play;
    private Set<String> hints;
    private GoogleSpeechRecognizerLanguage language;
    private CallableRedirect redirect;

    public CallableVerb verb() {
        return new CallableVerb(this);
    }
}
