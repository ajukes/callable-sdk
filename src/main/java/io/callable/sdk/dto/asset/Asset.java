package io.callable.sdk.dto.asset;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
public class Asset {
    private String id;
    private String bucket;
    private String key;
    private String filename;
    private String name;
    private String mimeType;
    private long size;
    private LocalDateTime created;
    private Map<String, String> meta;
}
