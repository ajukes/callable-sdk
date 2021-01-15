package io.callable.sdk;

import io.callable.sdk.dto.Organisation;
import io.callable.sdk.dto.account.Account;
import io.callable.sdk.dto.account.AccountPostRequest;

import java.util.List;

class OrganisationServiceImpl extends ServiceImpl implements OrganisationService {

    OrganisationServiceImpl() {
    }

    @Override
    public Organisation me() {
        return client.get("organisation/me", Organisation.class);
    }

    @Override
    public List<Account> accounts() {
        return client.list("customers", Account.class);
    }

    @Override
    public Account create(AccountPostRequest postRequest) {
        return client.post("customers", postRequest, Account.class);
    }


}
