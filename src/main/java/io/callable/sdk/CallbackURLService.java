package io.callable.sdk;

import io.callable.sdk.dto.callback.CallbackURL;
import io.callable.sdk.dto.callback.CallbackURLPostRequest;
import io.callable.sdk.dto.callback.CallbackURLPutRequest;

import java.util.List;

public interface CallbackURLService {

    List<CallbackURL> list();

    CallbackURL findByApplication(String app);

    CallbackURL findByApplication(CallbackApplication app);

    CallbackURL get(String id);

    CallbackURL create(CallbackURLPostRequest postRequest);

    void update(CallbackURLPutRequest putRequest);

    void remove(String id);
}
