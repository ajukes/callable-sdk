package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class Connector {
    private String connectTo;
}
