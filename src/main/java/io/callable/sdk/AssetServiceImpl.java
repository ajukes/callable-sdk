package io.callable.sdk;

import io.callable.sdk.dto.asset.Asset;
import io.callable.sdk.dto.asset.AssetPutRequest;

import java.io.File;
import java.util.List;

class AssetServiceImpl extends ServiceImpl implements AssetService {

    private static final String BASE_URL = "customers/%s/asset";
    private String id;

    AssetServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<Asset> list() {
        return client.list(String.format(BASE_URL, id), Asset.class);
    }

    @Override
    public Asset get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, Asset.class);
    }

    @Override
    public Boolean upload(File file) {
        return client.upload(String.format(BASE_URL, id), file);
    }

    @Override
    public void update(AssetPutRequest putRequest, String childId) {
        client.put(String.format(BASE_URL, id) + "/" + childId, putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }

}
