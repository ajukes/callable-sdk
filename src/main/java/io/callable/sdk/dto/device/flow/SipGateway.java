package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder
public class SipGateway extends CallCompleteHandler implements Endpoint, Serializable {
    private Integer ringTime;
    private Integer maxCallTime;
    private Boolean record;
    private List<String> trunks;
    private String present;
    private String countryCode;
}
