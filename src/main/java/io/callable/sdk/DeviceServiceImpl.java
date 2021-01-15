package io.callable.sdk;

import uk.co.viva.dataobjects.device.Device;
import uk.co.viva.dataobjects.device.DevicePostRequest;
import uk.co.viva.dataobjects.device.DevicePutRequest;
import uk.co.viva.dataobjects.sdk.enums.DeviceType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class DeviceServiceImpl extends ServiceImpl implements DeviceService {

    private static final String BASE_URL = "customers/%s/device";
    private String id;

    DeviceServiceImpl(String id) {
        this.id = id;
    }

    @Override
    public List<Device> list() {
        return client.list(String.format(BASE_URL, id), Device.class);
    }

    @Override
    public List<Device> findByDeviceType(DeviceType... deviceType) {
        List<Device> deviceList = client.list(String.format(BASE_URL, id), Device.class);
        List<String> deviceTypes = Arrays.stream(deviceType)
                .map(DeviceType::getType).collect(Collectors.toList());

        return deviceList.stream()
                .filter(device -> deviceTypes.contains(device.getType()))
                .collect(Collectors.toList());
    }

    @Override
    public Device get(String childId) {
        return client.get(String.format(BASE_URL, id) + "/" + childId, Device.class);
    }

    @Override
    public Device create(DevicePostRequest postRequest) {
        return client.post(String.format(BASE_URL, id), postRequest, Device.class);
    }

    @Override
    public void update(DevicePutRequest putRequest) {
       client.put(String.format(BASE_URL, id) + "/" + putRequest.getId(), putRequest, Void.class);
    }

    @Override
    public void remove(String id) {
        client.remove(String.format(BASE_URL, id) + "/" + id);
    }

}
