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
public class VoiceMail extends Connector {
    private String text;
    private String finishOnKey;
    private List<String> emailRecipients;
    private Integer timeout;
    private Integer maxLength;
    private Boolean transcribe;
    private Boolean playBeep;
}
