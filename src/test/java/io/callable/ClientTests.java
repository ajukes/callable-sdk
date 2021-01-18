package io.callable;

import io.callable.sdk.*;
import io.callable.sdk.dto.Organisation;
import io.callable.sdk.dto.Sid;
import io.callable.sdk.dto.VoiceCall;
import io.callable.sdk.dto.verbs.CallableTarget;
import io.callable.sdk.dto.verbs.PhoneNumber;
import io.callable.sdk.enums.DeviceType;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class ClientTests {

    @Test
    public void addAndRemoveAccount() {

        CallableClient client = CallableClientBuilder.builder()
                .withUrl(System.getProperty("CALLABLE_URL"))
                .withUsername(System.getProperty("CALLABLE_USERNAME"))
                .withPassword(System.getProperty("CALLABLE_PWD"))
                .build();

        OrganisationService organisationService = client.organisation();
        Organisation me = organisationService.me();

        AccountService accountService = organisationService.account(organisationService.accounts().get(0).getId());

        accountService.ddis().list().forEach(ddi -> log.info(ddi.getName()));

        accountService.devices().findByDeviceType(DeviceType.CLIENT).forEach(device -> log.info(device.getName()));

        accountService.integrations().list().forEach(integration -> log.info(integration.getUrl()));

//        ChannelService channelService = organisationService.channel(account.getId());
//
//        CallableTarget target = new CallableTarget(new PhoneNumber("+441234567890"));
//        VoiceCall voiceCall = new VoiceCall(target);
//        Sid sid = channelService.voice().create(voiceCall);
////
//        log.info("Calls SID: {}", sid);
    }
}
