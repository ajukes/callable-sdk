package io.callable.sdk.enums;

public enum ApplicationType {

    IVR_MAGENTA("ViVa-D2C"),
    IVR_MTI("ivr.mti"),
    IVR_CORDIC("ivr.cordic"),
    IVR_SHERLOCK("ivr.sherlock"),
    IVR_GENERIC("ivr.generic"),

    EVENT_MAGENTA("ViVa-TAPI"),
    EVENT_MAGENTA_TEAMS("event.magenta.teams"),
    EVENT_MTI("event.custom.mti"),
    EVENT_CALL("event.call"),
    EVENT_FLOW("event.action"),
    EVENT_PBX("event.pbx");

    private String application;

    private ApplicationType(String application) {
        this.application = application;
    }

    public String getApplication() {
        return this.application;
    }
}
