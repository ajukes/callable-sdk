package io.callable.sdk;

import io.callable.sdk.dto.asset.Asset;
import io.callable.sdk.dto.asset.AssetPutRequest;

import java.io.File;
import java.util.List;

public interface AssetService {

    List<Asset> list();

    Asset get(String id);

    Boolean upload(File file);

    void update(AssetPutRequest putRequest, String id);

    void remove(String id);
}
