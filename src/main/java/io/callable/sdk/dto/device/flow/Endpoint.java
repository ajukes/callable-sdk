package io.callable.sdk.dto.device.flow;

public interface Endpoint {
    Integer getRingTime();
    Integer getMaxCallTime();
    Boolean getRecord();
    String getPresent();
    String getCountryCode();
}
