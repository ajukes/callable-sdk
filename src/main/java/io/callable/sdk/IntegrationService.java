package io.callable.sdk;

import io.callable.sdk.dto.integration.Integration;
import io.callable.sdk.dto.integration.IntegrationPostRequest;
import io.callable.sdk.dto.integration.IntegrationPutRequest;
import io.callable.sdk.enums.ApplicationType;

import java.util.List;

public interface IntegrationService {

    List<Integration> list();

    Integration findByApplication(String app);

    Integration findByApplication(ApplicationType app);

    Integration get(String id);

    Integration create(IntegrationPostRequest postRequest);

    void update(IntegrationPutRequest putRequest, String id);

    void remove(String id);
}
