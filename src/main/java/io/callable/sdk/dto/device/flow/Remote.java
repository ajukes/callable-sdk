package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class Remote extends CallCompleteHandler implements Endpoint, Serializable {
    private String destination;
    private Integer ringTime;
    private Integer maxCallTime;
    private String countryCode;
    private Boolean record;
    private String present;
}
