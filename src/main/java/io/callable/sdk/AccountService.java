package io.callable.sdk;

import io.callable.sdk.dto.account.Account;

public interface AccountService {

    Account get();

    void remove();

    AddressService address();

    AssetService assets();

    DDIService ddis();

    DeviceService devices();

    IntegrationService integrations();

    SettingsService settings();

    TrunkService trunks();

    VoiceService calls();


}
