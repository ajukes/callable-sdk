package io.callable.sdk.dto.verbs;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Record {
    private String url;
    private String username;
    private String password;
    private Transcribe transcribe;
}
