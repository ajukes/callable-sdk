package io.callable.sdk.dto.account;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class AccountPutRequest {
    private String name;
    private String mbn;
    private String clientID;
    private String domain;
    private String type;

    public AccountPutRequest(@NotNull String name, @NotNull String mbn, @NotNull String clientID, String domain) {
        this.name = name;
        this.mbn = mbn;
        this.clientID = clientID;
        this.domain = domain;
        this.type = "viva-d";
    }
}