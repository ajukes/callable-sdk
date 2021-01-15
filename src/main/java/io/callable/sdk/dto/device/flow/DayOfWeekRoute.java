package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class DayOfWeekRoute extends Connector {
    private Set<Integer> days;
    private String onMatch;
}
