package io.callable.sdk.dto.setting;

import lombok.Getter;

@Getter
public class SettingsPostRequest {
    private String key;
    private String type;
    private String value;

    public SettingsPostRequest(String key, String type, String value) {
        this.key = key;
        this.type = type;
        this.value = value;
    }
}
