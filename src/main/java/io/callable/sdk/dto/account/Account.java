package io.callable.sdk.dto.account;

import io.callable.sdk.dto.address.Address;
import lombok.Getter;

@Getter
public class Account {
    private String id;
    private String name;
    private String mbn;
    private String domain;
    private Address address;
}
