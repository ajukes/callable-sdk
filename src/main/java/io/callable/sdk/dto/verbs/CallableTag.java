package io.callable.sdk.dto.verbs;

import lombok.Getter;

import java.util.Map;

@Getter
public class CallableTag {

    private Map<String, String> data;

    public CallableTag(Map<String, String> data) {
        this.data = data;
    }

    public CallableVerb verb() {
        return new CallableVerb(this);
    }
}
