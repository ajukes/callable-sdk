package io.callable.sdk;

import io.callable.sdk.dto.trunk.Trunk;
import io.callable.sdk.dto.trunk.TrunkPostRequest;
import io.callable.sdk.dto.trunk.TrunkPutRequest;

import java.util.List;

public interface TrunkService {

    List<Trunk> list();

    Trunk findByIP(String key);

    Trunk get(String id);

    Trunk create(TrunkPostRequest postRequest);

    void update(TrunkPutRequest putRequest, String id);

    void remove(String id);
}
