package io.callable.sdk;

import uk.co.viva.dataobjects.sdk.enums.SettingsKey;
import uk.co.viva.dataobjects.setting.Settings;
import uk.co.viva.dataobjects.setting.SettingsPostRequest;
import uk.co.viva.dataobjects.setting.SettingsPutRequest;

import java.util.List;

class SettingsServiceImpl extends ServiceImpl implements SettingsService {

    private static final String BASE_URL = "customers/%s/setting";

    private String id;

    SettingsServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<Settings> list() {
        return client.list(String.format(BASE_URL, id), Settings.class);
    }

    @Override
    public Settings findByKey(String key) {
        return getSettingsByKey(key);
    }

    @Override
    public Settings findByKey(SettingsKey key) {
        return getSettingsByKey(key.getKey());
    }

    @Override
    public Settings get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, Settings.class);
    }

    @Override
    public Settings create(SettingsPostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, Settings.class);
    }

    @Override
    public void update(SettingsPutRequest putRequest) {
        client.put(String.format(BASE_URL, id) + "/" + putRequest.getId(), putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }

    private Settings getSettingsByKey(String key) {
        List<Settings> settingList = client.list(String.format(BASE_URL, id), Settings.class);
        return settingList.stream()
                .filter(setting -> setting.getKey().equals(key))
                .findFirst()
                .orElse(null);
    }

}
