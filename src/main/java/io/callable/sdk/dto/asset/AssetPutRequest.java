package io.callable.sdk.dto.asset;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class AssetPutRequest {
    private String name;

    public AssetPutRequest( @NotNull String name) {
        this.name = name;
    }
}
