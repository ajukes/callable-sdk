package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HuntGroup extends CallCompleteHandler implements Endpoint {
    private Integer ringTime;
    private Integer maxCallTime;
    private Boolean record;
    private String present;
    private List<String> devices;
    private String countryCode;
}
