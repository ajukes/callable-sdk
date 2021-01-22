package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Remote extends CallCompleteHandler implements Endpoint, Serializable {
    private String destination;
    private Integer ringTime;
    private Integer maxCallTime;
    private String countryCode;
    private Boolean record;
    private String present;
}
