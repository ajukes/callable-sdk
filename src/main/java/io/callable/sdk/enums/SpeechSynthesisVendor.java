package io.callable.sdk.enums;

public enum SpeechSynthesisVendor {
    GOOGLE("google"),
    AMAZON("amazon");

    private String vendor;

    private SpeechSynthesisVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }
}
