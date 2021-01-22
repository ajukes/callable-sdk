package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TimeOfDay extends Connector {
    private String id;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private LocalDateTime timeFrom;
    private LocalDateTime timeTo;
    private List<Integer> days;
}
