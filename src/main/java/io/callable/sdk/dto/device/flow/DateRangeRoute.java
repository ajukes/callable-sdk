package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class DateRangeRoute extends Connector {
    private LocalDateTime start;
    private LocalDateTime end;
    private String onMatch;
}
