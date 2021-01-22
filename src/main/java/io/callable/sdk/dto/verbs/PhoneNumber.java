package io.callable.sdk.dto.verbs;

import lombok.Getter;

@Getter
public class PhoneNumber {
    private String number;

    public PhoneNumber(String number) {
        this.number = number;
    }

}
