package io.callable.sdk.enums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public enum GatherType {
    DIGITS("digits"),
    SPEECH("speech");

    private String type;

    private GatherType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Set<String> toSet() {
        return new HashSet<>(Arrays.asList(this.type));
    }
}
