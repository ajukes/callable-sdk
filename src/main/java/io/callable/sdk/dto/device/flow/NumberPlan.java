package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NumberPlan extends Connector {
    private String text;
    private Integer timeout;
    private String finishOnKey;
    private Integer maxDigits;
    private List<Option> options;
}
