package io.callable.sdk;


import io.callable.sdk.dto.Sid;
import io.callable.sdk.dto.VoiceCall;

public interface VoiceService {

    Sid create(VoiceCall voiceCall);
}
