package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teams extends CallCompleteHandler implements Endpoint {
    private String to;
    private Integer ringTime;
    private Integer maxCallTime;
    private Boolean record;
    private String present;
    private String countryCode;
}
