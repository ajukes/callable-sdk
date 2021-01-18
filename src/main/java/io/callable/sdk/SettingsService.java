package io.callable.sdk;

import io.callable.sdk.dto.setting.Settings;
import io.callable.sdk.dto.setting.SettingsPostRequest;
import io.callable.sdk.dto.setting.SettingsPutRequest;
import io.callable.sdk.enums.SettingsKey;

import java.util.List;

public interface SettingsService {

    List<Settings> list();

    Settings findByKey(SettingsKey key);

    Settings findByKey(String key);

    Settings get(String id);

    Settings create(SettingsPostRequest postRequest);

    void update(SettingsPutRequest putRequest, String id);

    void remove(String id);
}
