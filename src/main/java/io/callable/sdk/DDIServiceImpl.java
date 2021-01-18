package io.callable.sdk;

import io.callable.sdk.dto.ddi.DDI;
import io.callable.sdk.dto.ddi.DDIPostRequest;
import io.callable.sdk.dto.ddi.DDIPutRequest;

import java.util.List;
import java.util.stream.Collectors;

class DDIServiceImpl extends ServiceImpl implements DDIService {

    private static final String BASE_URL = "customers/%s/ddi";

    private String id;

    DDIServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<DDI> list() {
        return client.list(String.format(BASE_URL, id), DDI.class);
    }

    @Override
    public List<DDI> findByNameContaining(String... ilike) {
        List<DDI> ddiList = client.list(String.format(BASE_URL, id), DDI.class);
        return ddiList.stream()
                .filter(ddi -> {
                    boolean found = false;
                    for (String s : ilike) {
                        if (ddi.getName().contains(s)) {
                            found = true;
                        }
                    }
                    return found;
                })
                .collect(Collectors.toList());
    }

    @Override
    public DDI get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, DDI.class);
    }

    @Override
    public DDI create(DDIPostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, DDI.class);
    }

    @Override
    public void update(DDIPutRequest putRequest, String childId) {
        client.put(String.format(BASE_URL, id) + "/" + childId, putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }


}
