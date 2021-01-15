package io.callable.sdk;

import uk.co.viva.dataobjects.callback.CallbackURL;
import uk.co.viva.dataobjects.callback.CallbackURLPostRequest;
import uk.co.viva.dataobjects.callback.CallbackURLPutRequest;
import uk.co.viva.dataobjects.sdk.enums.CallbackApplication;

import java.util.List;

class CallbackURLServiceImpl extends ServiceImpl implements CallbackURLService {

    private static final String BASE_URL = "customers/%s/callback";

    private String id;

    CallbackURLServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<CallbackURL> list() {
        return client.list(String.format(BASE_URL, id), CallbackURL.class);
    }

    @Override
    public CallbackURL findByApplication(String app) {
        return getCallbackURL(app);
    }

    @Override
    public CallbackURL findByApplication(CallbackApplication app) {
        return getCallbackURL(app.getApplication());
    }

    @Override
    public CallbackURL get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, CallbackURL.class);
    }

    @Override
    public CallbackURL create(CallbackURLPostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, CallbackURL.class);
    }

    @Override
    public void update(CallbackURLPutRequest putRequest) {
        client.put(String.format(BASE_URL, id) + "/" + putRequest.getId(), putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }

    private CallbackURL getCallbackURL(String app) {
        List<CallbackURL> callbackList = client.list(String.format(BASE_URL, id), CallbackURL.class);
        return callbackList.stream()
                .filter(callback -> callback.getApp().equals(app))
                .findFirst()
                .orElse(null);
    }


}
