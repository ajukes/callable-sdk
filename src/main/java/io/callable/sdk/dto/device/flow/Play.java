package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Play extends Connector {
    private String url;
}
