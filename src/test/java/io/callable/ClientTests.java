package io.callable;

import io.callable.sdk.AccountService;
import io.callable.sdk.CallableClient;
import io.callable.sdk.CallableClientBuilder;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import uk.co.viva.dataobjects.address.CustomerAddress;
import uk.co.viva.dataobjects.customer.Customer;

@Slf4j
public class ClientTests {

    @Test
    public void testone() {

        CallableClient client = CallableClientBuilder.builder()
                .withUrl("http://localhost:8080")
                .withUsername("ajukes@vibecoms.co.uk")
                .withPassword("V1bep@55")
                .build();

        CustomerAddress address = new CustomerAddress();
        address.setLine1("xxx");
        address.setLine2("xxx");
        address.setLevel2("xxx");
        address.setLevel1("xxx");
        address.setPostalCode("XX1 1XX");
        address.setCountry("United Kingdom");

        Customer account = client.organisation().accounts().get(0);

        AccountService accountService = client.account(account.getId());



//        CallableTarget target = new CallableTarget(new PhoneNumber("+447956697540"));
//        VoiceCall voiceCall = new VoiceCall(target);
//
//        Sid sid = client.account("495df9c4-488d-2ca7-325a-5e2af0cfe259").calls().create(voiceCall);
//
//        log.info("Calls SID: {}", sid);
    }
}
