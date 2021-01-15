package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Script extends Connector {
    private String code;
}
