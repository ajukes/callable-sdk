package io.callable.sdk.dto.device.flow;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class VoiceMail extends Connector {
    private String text;
    private String finishOnKey;
    private List<String> emailRecipients;
    private Integer timeout;
    private Integer maxLength;
    private Boolean transcribe;
    private Boolean playBeep;
}
