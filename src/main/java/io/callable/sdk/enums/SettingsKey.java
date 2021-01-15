package io.callable.sdk.enums;

public enum SettingsKey {

    RECORDING_RETENTION("recording.retention"),
    OBP_PRESENTATION("obp.present"),
    MAX_CHANNELS("SoftwareChannels"),
    OUTBOUND_RECORD("dial.record"),
    TEAMS_DOMAIN("teamsDomain");

    private String key;

    private SettingsKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }
}
