package io.callable;

import io.callable.sdk.*;
import io.callable.sdk.dto.Sid;
import io.callable.sdk.dto.VoiceCall;
import io.callable.sdk.dto.account.Account;
import io.callable.sdk.dto.verbs.*;
import io.callable.sdk.enums.GoogleTTSLanguage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;

@Slf4j
public class ClientTests {

    private static String CALLABLE_URL = System.getenv("CALLABLE_URL");
    private static String CALLABLE_USERNAME = System.getenv("CALLABLE_USERNAME");
    private static String CALLABLE_PWD = System.getenv("CALLABLE_PWD");

    @Test
    public void addAndRemoveAccount() {

        CallableClient client = CallableClientBuilder.builder()
                .withUrl(CALLABLE_URL)
                .withUsername(CALLABLE_USERNAME)
                .withPassword(CALLABLE_PWD)
                .build();

        OrganisationService organisationService = client.organisation();

        AccountService accountService = organisationService.account("5f51637ce390c45fbc95ace6");

        Account account = accountService.get();

        ChannelService channelService = organisationService.channel(account.getId());

        //The Target of initial outbound call
        //Targeting an off net mobile phone but could be a device id or extension number
        CallableTarget target = new CallableTarget(new PhoneNumber("+447956697540"));

        //Can be any ddi that belongs to account
        //I have simply chosen account main presentation number
        String callerId = account.getMbn();

        //Add a list of verbs when the initial
        //outbound call connects
        List<CallableVerb> verbs = new ArrayList<>();

        CallableSay say = new CallableSay(Arrays.asList("Your taxi has arrived"), 1, GoogleTTSLanguage.English_UK_Wavenet_B_Male);
        verbs.add(say.verb());

//        //Redirect the gather verb to another device on dtmf digit
//        Device device = accountService.devices().list().stream()
//                .filter(device1 -> device1.getExtension().equals("308"))
//                .findFirst()
//                .orElseThrow(() -> new AssertionError("No Device"));
//
//        CallableRedirect redirect = new CallableRedirect(device);
//
//        CallableVerb gather = CallableGather.builder()
//                .input(GatherType.DIGITS.toSet())
//                .finishOnKey("#")
//                .timeout(10)
//                .numDigits(1)
//                .redirect(redirect)
//                .say(say)
//                .build()
//                .verb();
//
//        verbs.add(gather);

//        //Redirect the gather verb to another device on  timeout
//        verbs.add(redirect.verb());

        //Create the voice call

        Map<String, String> tagData = new HashMap<>();
        tagData.put("jobNumber", "1234");
        tagData.put("customerName", "Darren Cubitt");
        tagData.put("driverName", "Joseph Blunt");
        CallableTag tag = new CallableTag(tagData);

        VoiceCall voiceCall = VoiceCall.builder()
                .callerId(callerId)
                .target(target)
                .tag(tag)
                .verbs(verbs)
                .build();

        Sid sid = channelService.voice().create(voiceCall);


        log.info("Calls SID: {}", sid.getSid());
    }
}
