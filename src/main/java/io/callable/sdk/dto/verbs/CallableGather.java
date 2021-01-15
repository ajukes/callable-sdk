package io.callable.sdk.dto.verbs;


import io.callable.sdk.enums.GoogleSpeechRecognizerLanguage;
import lombok.Builder;
import lombok.Getter;

import java.util.Arrays;
import java.util.HashSet;
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

    public static CallableGather digits(String finishOnKey, Integer numDigits, Integer timeout, CallableSay say) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("digits")))
                .numDigits(numDigits)
                .timeout(timeout)
                .say(say)
                .build();
    }

    public static CallableGather digits(String finishOnKey, Integer numDigits, Integer timeout, CallablePlay play) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("digits")))
                .numDigits(numDigits)
                .timeout(timeout)
                .play(play)
                .build();
    }

    public static CallableGather speech(String finishOnKey, Integer timeout, Set<String> hints, CallableSay say) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("speech")))
                .hints(hints)
                .timeout(timeout)
                .say(say)
                .build();
    }

    public static CallableGather speech(String finishOnKey, Integer timeout, Set<String> hints, CallablePlay play) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("speech")))
                .hints(hints)
                .timeout(timeout)
                .play(play)
                .build();
    }


    public static CallableGather speech(String finishOnKey, Integer timeout, GoogleSpeechRecognizerLanguage language, Set<String> hints, CallableSay say) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("speech")))
                .language(language)
                .hints(hints)
                .timeout(timeout)
                .say(say)
                .build();
    }

    public static CallableGather speech(String finishOnKey, Integer timeout, GoogleSpeechRecognizerLanguage language, Set<String> hints, CallablePlay play) {
        return CallableGather.builder()
                .finishOnKey(finishOnKey)
                .input(new HashSet<>(Arrays.asList("speech")))
                .language(language)
                .hints(hints)
                .timeout(timeout)
                .play(play)
                .build();
    }
}
