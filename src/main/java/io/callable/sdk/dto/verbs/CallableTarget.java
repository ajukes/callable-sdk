package io.callable.sdk.dto.verbs;

import io.callable.sdk.dto.device.Device;
import lombok.Getter;

@Getter
public class CallableTarget {

    private Device device;
    private SipURI sipURI;
    private PhoneNumber phoneNumber;

    public CallableTarget(Device device) {
        this.device = device;
    }

    public CallableTarget(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CallableTarget(SipURI sipURI) {
        this.sipURI = sipURI;
    }


}
