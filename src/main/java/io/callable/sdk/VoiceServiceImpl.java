package io.callable.sdk;

import io.callable.sdk.dto.Sid;
import io.callable.sdk.dto.VoiceCall;

class VoiceServiceImpl extends ServiceImpl implements VoiceService {

    private static final String BASE_URL = "channels/voice/%s";

    private String id;

    VoiceServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public Sid create(VoiceCall voiceCall) {
        return client.post(String.format(BASE_URL, id), voiceCall, Sid.class);
    }
}
