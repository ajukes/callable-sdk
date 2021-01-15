package io.callable.sdk;

import io.callable.sdk.dto.account.Account;

public interface AccountService {

    Account get();

    void remove();

    AssetService assets();

    DeviceService devices();

    DDIService ddis();

    AddressService address();

    CallService calls();

}
