package io.callable.sdk;

import io.callable.sdk.dto.account.Account;

class AccountServiceImpl extends ServiceImpl implements AccountService {

    private String id;

    AccountServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public Account get() {
        return client.get("customers/" + id, Account.class);
    }

    @Override
    public void remove() {
        client.remove("customers/" + id);
    }

    @Override
    public AssetService assets() {
        return new AssetServiceImpl(id);
    }

    @Override
    public DeviceService devices() {
        return new DeviceServiceImpl(id);
    }

    @Override
    public DDIService ddis() {
        return new DDIServiceImpl(id);
    }

    @Override
    public AddressService address() {
        return new AddressServiceImpl(id);
    }

    @Override
    public CallService calls() {
        return new CallServiceImpl(id);
    }

}
