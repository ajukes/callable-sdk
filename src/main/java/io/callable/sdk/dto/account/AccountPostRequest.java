package io.callable.sdk.dto.account;

import io.callable.sdk.dto.Organisation;
import io.callable.sdk.dto.address.Address;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

@Getter
public class AccountPostRequest {
    private String organisation;
    private String name;
    private String mbn;
    private String clientID;
    private String domain;
    private String type;
    private Address address;

    public AccountPostRequest(@NotNull Organisation organisation, @NotNull String name, @NotNull Address address) {
        this.organisation = organisation.getId();
        this.name = name;
        this.mbn = "provided";
        this.clientID = getUUID();
        this.domain = getDomain(name);
        this.type = "viva-d";
        this.address = address;
    }

    private static String getUUID() {
        return UUID.randomUUID().toString();
    }

    private static String getDomain(String name) {
        return name.replaceAll(" ", "").toLowerCase();
    }
}