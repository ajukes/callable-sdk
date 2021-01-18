package io.callable.sdk;


import io.callable.sdk.dto.ddi.DDI;
import io.callable.sdk.dto.ddi.DDIPostRequest;
import io.callable.sdk.dto.ddi.DDIPutRequest;

import java.util.List;

public interface DDIService {

    List<DDI> list();

    List<DDI> findByNameContaining(String... ilike);

    DDI get(String id);

    DDI create(DDIPostRequest postRequest);

    void update(DDIPutRequest putRequest, String id);

    void remove(String id);
}
