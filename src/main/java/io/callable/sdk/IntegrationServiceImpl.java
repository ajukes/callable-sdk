package io.callable.sdk;

import io.callable.sdk.dto.integration.Integration;
import io.callable.sdk.dto.integration.IntegrationPostRequest;
import io.callable.sdk.dto.integration.IntegrationPutRequest;
import io.callable.sdk.enums.ApplicationType;

import java.util.List;

class IntegrationServiceImpl extends ServiceImpl implements IntegrationService {

    private static final String BASE_URL = "customers/%s/callback";

    private String id;

    IntegrationServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<Integration> list() {
        return client.list(String.format(BASE_URL, id), Integration.class);
    }

    @Override
    public Integration findByApplication(String app) {
        return getCallbackURL(app);
    }

    @Override
    public Integration findByApplication(ApplicationType app) {
        return getCallbackURL(app.getApplication());
    }

    @Override
    public Integration get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, Integration.class);
    }

    @Override
    public Integration create(IntegrationPostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, Integration.class);
    }

    @Override
    public void update(IntegrationPutRequest putRequest, String childId) {
        client.put(String.format(BASE_URL, id) + "/" + childId, putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }

    private Integration getCallbackURL(String app) {
        List<Integration> callbackList = client.list(String.format(BASE_URL, id), Integration.class);
        return callbackList.stream()
                .filter(callback -> callback.getApp().equals(app))
                .findFirst()
                .orElse(null);
    }


}
