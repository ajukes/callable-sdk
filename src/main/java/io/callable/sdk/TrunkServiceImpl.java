package io.callable.sdk;

import uk.co.viva.dataobjects.trunk.Trunk;
import uk.co.viva.dataobjects.trunk.TrunkPostRequest;
import uk.co.viva.dataobjects.trunk.TrunkPutRequest;

import java.util.List;

class TrunkServiceImpl extends ServiceImpl implements TrunkService {

    private static final String BASE_URL = "customers/%s/trunk";

    private String id;

    TrunkServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<Trunk> list() {
        return client.list(String.format(BASE_URL, id), Trunk.class);
    }

    @Override
    public Trunk findByIP(String ip) {
        List<Trunk> trunkList = client.list(String.format(BASE_URL, id), Trunk.class);
        return trunkList.stream()
                .filter(trunk -> trunk.getIp().equals(ip))
                .findFirst()
                .orElse(null);
    }


    @Override
    public Trunk get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, Trunk.class);
    }

    @Override
    public Trunk create(TrunkPostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, Trunk.class);
    }

    @Override
    public void update(TrunkPutRequest putRequest) {
        client.put(String.format(BASE_URL, id) + "/" + putRequest.getId(), putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }


}
