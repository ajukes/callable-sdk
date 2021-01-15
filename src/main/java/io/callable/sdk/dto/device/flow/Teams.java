package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Teams extends CallCompleteHandler implements Endpoint {
    private String to;
    private Integer ringTime;
    private Integer maxCallTime;
    private Boolean record;
    private String present;
    private String countryCode;
}
