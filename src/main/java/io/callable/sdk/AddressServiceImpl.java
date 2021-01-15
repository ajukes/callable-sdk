package io.callable.sdk;


import io.callable.sdk.dto.address.AddressPutRequest;

class AddressServiceImpl extends ServiceImpl implements AddressService {

    private static final String BASE_URL = "customers/%s/address";
    private final String id;

    AddressServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public void update(AddressPutRequest putRequest) {
        client.put(String.format(BASE_URL, id), putRequest, Void.class);
    }


}
