package io.callable.sdk.enums;

public enum DeviceType {
    SIP("SIP"),
    SIP_GATEWAY("SIP_GATEWAY"),
    CLIENT("CLIENT"),
    REMOTE("REMOTE"),
    ROUTE_START("ROUTE_START"),
    MATCH_START("MATCH_START"),
    OUTBOUND_OVERRIDE("OUTBOUND_OVERRIDE"),
    HUNT_GROUP("HUNT_GROUP"),
    TIME_ROUTER("TIME_ROUTER"),
    ANI_ROUTER("ANI_ROUTER"),
    DNIS_ROUTER("DNIS_ROUTER"),
    NUMBER_PLAN("NUMBER_PLAN"),
    ZONE_ROUTER("ZONE_ROUTER"),
    PLUGIN("PLUGIN"),
    SAY("SAY"),
    PLAY("PLAY"),
    VOICEMAIL("VOICEMAIL"),
    TEAM("TEAMS"),
    TIME_RANGE_ROUTER("TIME_RANGE_ROUTER"),
    DAY_OF_WEEK_ROUTER("DAY_OF_WEEK_ROUTER"),
    DATE_RANGE_ROUTER("DATE_RANGE_ROUTER"),
    SCRIPT("SCRIPT");

    private String type;

    private DeviceType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
