package io.callable.sdk.dto.verbs;

import io.callable.sdk.dto.device.Device;
import lombok.Getter;

@Getter
public class CallableRedirect {

    private Device device;

    public CallableRedirect(Device device) {
        this.device = device;
    }

    public CallableVerb verb() {
        return new CallableVerb(this);
    }
}
