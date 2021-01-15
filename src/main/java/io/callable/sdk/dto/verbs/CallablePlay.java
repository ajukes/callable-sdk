package io.callable.sdk.dto.verbs;

import io.callable.sdk.dto.asset.Asset;
import lombok.Getter;

@Getter
public class CallablePlay {
    private Asset asset;
    private String url;
    private Integer loop;

    public CallablePlay(Asset asset, Integer loop) {
        this.asset = asset;
        this.loop = loop;
    }

    public CallablePlay(String url, Integer loop) {
        this.url = url;
        this.loop = loop;
    }
}
