package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class CallCompleteHandler  {
    private String onComplete;
    private String onFail;
    private String onNoAnswer;
    private String onBusy;
}
