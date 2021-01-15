package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Plugin extends CallCompleteHandler {
    private String data;
}
