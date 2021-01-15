package io.callable.sdk;


import uk.co.viva.dataobjects.sdk.Sid;
import uk.co.viva.dataobjects.sdk.VoiceCall;

public interface CallService {

    Sid create(VoiceCall voiceCall);
}
