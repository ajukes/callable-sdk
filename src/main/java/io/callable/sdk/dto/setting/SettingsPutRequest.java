package io.callable.sdk.dto.setting;

import lombok.Getter;

@Getter
public class SettingsPutRequest {
    private String key;
    private String type;
    private String value;

    public SettingsPutRequest(String key, String type, String value) {
        this.key = key;
        this.type = type;
        this.value = value;
    }
}
