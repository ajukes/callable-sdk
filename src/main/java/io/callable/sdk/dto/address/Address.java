package io.callable.sdk.dto.address;

import lombok.Data;
import lombok.Getter;

@Getter
public class Address {
    private String line1;
    private String line2;
    private String level1;
    private String level2;
    private String postalCode;
    private String country;
}
