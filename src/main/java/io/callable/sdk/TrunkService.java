package io.callable.sdk;

import uk.co.viva.dataobjects.trunk.Trunk;
import uk.co.viva.dataobjects.trunk.TrunkPostRequest;
import uk.co.viva.dataobjects.trunk.TrunkPutRequest;

import java.util.List;

public interface TrunkService {

    List<Trunk> list();

    Trunk findByIP(String key);

    Trunk get(String id);

    Trunk create(TrunkPostRequest postRequest);

    void update(TrunkPutRequest putRequest);

    void remove(String id);
}
