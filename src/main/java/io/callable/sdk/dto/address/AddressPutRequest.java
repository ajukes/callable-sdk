package io.callable.sdk.dto.address;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AddressPutRequest {
    private String line1;
    private String line2;
    private String level1;
    private String level2;
    private String postalCode;
    private String country;
}
