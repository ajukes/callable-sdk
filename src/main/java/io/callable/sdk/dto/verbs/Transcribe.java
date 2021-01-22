package io.callable.sdk.dto.verbs;

import io.callable.sdk.enums.GoogleSpeechRecognizerLanguage;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Transcribe {
    private String url;
    private String username;
    private String password;
    private GoogleSpeechRecognizerLanguage language;
}
