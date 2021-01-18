package io.callable.sdk.dto.account;

import io.callable.sdk.dto.address.Address;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class AccountPostRequest {
    private String organisation;
    private String name;
    private String domain;
    private Address address;
}