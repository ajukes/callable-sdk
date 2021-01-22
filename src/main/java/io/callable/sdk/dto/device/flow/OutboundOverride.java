package io.callable.sdk.dto.device.flow;

import lombok.*;

import java.io.Serializable;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OutboundOverride implements Endpoint, Serializable {
    private Integer ringTime;
    private Integer maxCallTime;
    private Boolean record;
    private String present;
    private String countryCode;
    private Integer strip;
    private Integer prepend;
}
