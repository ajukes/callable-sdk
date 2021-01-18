package io.callable.sdk;

public interface ChannelService {
    VoiceService voice();

    SMSService sms();

    EmailService email();
}
