package io.callable.sdk.dto.ddi;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DDIPutRequest {
    private String id;
    private String name;
    private String direction;
    private String match;
    private Boolean record;
    private String present;
    private Boolean mbn;
    private String trunk;
    private String ivr;
}
