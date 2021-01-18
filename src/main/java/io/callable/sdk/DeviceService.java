package io.callable.sdk;

import io.callable.sdk.dto.device.Device;
import io.callable.sdk.dto.device.DevicePostRequest;
import io.callable.sdk.dto.device.DevicePutRequest;
import io.callable.sdk.enums.DeviceType;

import java.util.List;

public interface DeviceService {

    List<Device> list();

    List<Device> findByDeviceType(DeviceType... deviceType);

    Device get(String id);

    Device create(DevicePostRequest postRequest);

    void update(DevicePutRequest putRequest, String id);

    void remove(String id);
}
