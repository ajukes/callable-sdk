package io.callable.sdk;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class CallableClientImpl implements CallableClient {

    private final CallableHTTPClient client;

    CallableClientImpl(String url, String username, String password) {
        this.client = CallableHTTPClient.getInstance(url, username, password);
    }

    @Override
    public OrganisationService organisation() {
        return new OrganisationServiceImpl();
    }

}
