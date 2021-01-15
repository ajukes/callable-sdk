package io.callable.sdk.dto.asset;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class AssetPutRequest {
    private String id;
    private String name;

    public AssetPutRequest(@NotNull String id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }
}
