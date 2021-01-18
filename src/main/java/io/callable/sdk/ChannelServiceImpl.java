package io.callable.sdk;

public class ChannelServiceImpl implements ChannelService {

    private final String id;

    public ChannelServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public VoiceService voice() {
        return new VoiceServiceImpl(id);
    }

    @Override
    public SMSService sms() {
        return null;
    }

    @Override
    public EmailService email() {
        return null;
    }
}
