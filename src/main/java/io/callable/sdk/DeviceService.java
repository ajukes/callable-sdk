package io.callable.sdk;

import uk.co.viva.dataobjects.device.Device;
import uk.co.viva.dataobjects.device.DevicePostRequest;
import uk.co.viva.dataobjects.device.DevicePutRequest;
import uk.co.viva.dataobjects.sdk.enums.DeviceType;

import java.util.List;

public interface DeviceService {

    List<Device> list();

    List<Device> findByDeviceType(DeviceType... deviceType);

    Device get(String id);

    Device create(DevicePostRequest postRequest);

    void update(DevicePutRequest putRequest);

    void remove(String id);
}
