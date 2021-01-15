package io.callable.sdk.dto.trunk;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TrunkPutRequest {
    private String ip;
    private Integer port;
    private Integer priority;
    private String vendor;
    private Boolean monitored;
    private String callerFormat;
    private String calledFormat;
    private String description;
    private String zone;
    private String countryCode;
}
