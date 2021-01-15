package io.callable.sdk;

public interface CallableClient {

    OrganisationService organisation();

    AccountService account(String id);

}
