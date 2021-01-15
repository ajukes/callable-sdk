package io.callable.sdk.enums;

public enum SpeechRecognizerVendor {
    GOOGLE("google"),
    AMAZON("amazon");

    private String vendor;

    private SpeechRecognizerVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getVendor() {
        return this.vendor;
    }
}
