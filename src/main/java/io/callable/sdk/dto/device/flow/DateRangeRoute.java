package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DateRangeRoute extends Connector {
    private LocalDateTime start;
    private LocalDateTime end;
    private String onMatch;
}
