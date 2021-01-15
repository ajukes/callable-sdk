package io.callable.sdk;

import uk.co.viva.dataobjects.sdk.Sid;
import uk.co.viva.dataobjects.sdk.VoiceCall;

class CallServiceImpl extends ServiceImpl implements CallService {

    private static final String BASE_URL = "customers/%s/calls";

    private String id;

    CallServiceImpl(String id) {
        this.id = id;
    }


    @Override
    public Sid create(VoiceCall voiceCall) {
        return client.post(String.format(BASE_URL, id), voiceCall, Sid.class);
    }
}
