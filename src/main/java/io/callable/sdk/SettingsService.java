package io.callable.sdk;

import uk.co.viva.dataobjects.sdk.enums.SettingsKey;
import uk.co.viva.dataobjects.setting.Settings;
import uk.co.viva.dataobjects.setting.SettingsPostRequest;
import uk.co.viva.dataobjects.setting.SettingsPutRequest;

import java.util.List;

public interface SettingsService {

    List<Settings> list();

    Settings findByKey(SettingsKey key);

    Settings findByKey(String key);

    Settings get(String id);

    Settings create(SettingsPostRequest postRequest);

    void update(SettingsPutRequest putRequest);

    void remove(String id);
}
