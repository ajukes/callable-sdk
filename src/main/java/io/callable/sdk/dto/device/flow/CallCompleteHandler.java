package io.callable.sdk.dto.device.flow;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CallCompleteHandler  {
    private String onComplete;
    private String onFail;
    private String onNoAnswer;
    private String onBusy;
}
