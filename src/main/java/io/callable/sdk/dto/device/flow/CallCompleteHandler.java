package io.callable.sdk.dto.device.flow;

import lombok.Getter;

@Getter
public class CallCompleteHandler  {
    private String onComplete;
    private String onFail;
    private String onNoAnswer;
    private String onBusy;
}
