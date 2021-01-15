package io.callable.sdk.dto.verbs;

import lombok.Getter;

@Getter
public class SipURI {

    private String uri;

    public SipURI(String uri) {
        this.uri = uri;
    }
}
