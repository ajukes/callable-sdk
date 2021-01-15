package io.callable.sdk;

import io.callable.sdk.dto.Organisation;
import io.callable.sdk.dto.account.Account;
import io.callable.sdk.dto.account.AccountPostRequest;

import java.util.List;

public interface OrganisationService {

    Organisation me();

    List<Account> accounts();

    Account create(AccountPostRequest postRequest);

}
