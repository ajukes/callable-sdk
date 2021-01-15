package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@Builder
public class TimeRangeRoute extends Connector {
    private LocalTime start;
    private LocalTime end;
    private String onMatch;
}
