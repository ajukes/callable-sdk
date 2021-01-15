package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class ZoneRouter extends Connector {
    private List<Option> options;
}