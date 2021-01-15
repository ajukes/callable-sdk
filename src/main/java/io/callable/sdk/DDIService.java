package io.callable.sdk;

import uk.co.viva.dataobjects.ddi.DDI;
import uk.co.viva.dataobjects.ddi.DDIPostRequest;
import uk.co.viva.dataobjects.ddi.DDIPutRequest;

import java.util.List;

public interface DDIService {

    List<DDI> list();

    List<DDI> findByNameContaining(String... ilike);

    DDI get(String id);

    DDI create(DDIPostRequest postRequest);

    void update(DDIPutRequest putRequest);

    void remove(String id);
}
