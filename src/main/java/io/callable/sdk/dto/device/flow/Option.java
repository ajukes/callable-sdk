package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Option extends Connector {
    private String option;
}
