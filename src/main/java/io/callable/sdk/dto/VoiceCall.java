package io.callable.sdk.dto;

import io.callable.sdk.dto.verbs.CallableTag;
import io.callable.sdk.dto.verbs.CallableTarget;
import io.callable.sdk.dto.verbs.CallableVerb;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VoiceCall {
    private String callerId;
    private CallableTag tag;
    private CallableTarget target;
    private List<CallableVerb> verbs;
}
