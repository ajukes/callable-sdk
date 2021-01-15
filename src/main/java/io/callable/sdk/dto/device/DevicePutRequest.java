package io.callable.sdk.dto.device;

import io.callable.sdk.dto.device.flow.*;
import io.callable.sdk.enums.DeviceType;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

@Getter
public class DevicePutRequest {
    private String extension;
    private String type;
    private String name;
    private TimeBasedRoute timeBasedRoute;
    private ANIRouter aniRouter;
    private DNISRouter dnisRouter;
    private StartRoute startRoute;
    private RegexRoute regexRoute;
    private HuntGroup huntGroup;
    private NumberPlan numberPlan;
    private ZoneRouter zoneRouter;
    private Client client;
    private SipExtension sipExtension;
    private SipGateway sipGateway;
    private Remote remote;
    private Plugin plugin;
    private Play play;
    private Say say;
    private Teams teams;
    private TimeRangeRoute timeRangeRoute;
    private DayOfWeekRoute dayOfWeekRoute;
    private DateRangeRoute dateRangeRoute;
    private Script script;

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull TimeBasedRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.TIME_ROUTER.getType();
        this.timeBasedRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull ANIRouter device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.ANI_ROUTER.getType();
        this.aniRouter = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull DNISRouter device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.DNIS_ROUTER.getType();
        this.dnisRouter = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull StartRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.ROUTE_START.getType();
        this.startRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull RegexRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.MATCH_START.getType();
        this.regexRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull HuntGroup device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.HUNT_GROUP.getType();
        this.huntGroup = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull NumberPlan device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.NUMBER_PLAN.getType();
        this.numberPlan = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull ZoneRouter device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.ZONE_ROUTER.getType();
        this.zoneRouter = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Client device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.CLIENT.getType();
        this.client = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull SipExtension device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.SIP.getType();
        this.sipExtension = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull SipGateway device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.SIP_GATEWAY.getType();
        this.sipGateway = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Remote device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.REMOTE.getType();
        this.remote = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Plugin device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.PLUGIN.getType();
        this.plugin = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Play device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.PLAY.getType();
        this.play = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Say device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.SAY.getType();
        this.say = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Teams device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.TEAM.getType();
        this.teams = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull TimeRangeRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.TIME_RANGE_ROUTER.getType();
        this.timeRangeRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull DayOfWeekRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.DAY_OF_WEEK_ROUTER.getType();
        this.dayOfWeekRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull DateRangeRoute device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.DATE_RANGE_ROUTER.getType();
        this.dateRangeRoute = device;
    }

    public DevicePutRequest(@NotNull String extension, @NotNull String name, @NotNull Script device) {
        this.extension = extension;
        this.name = name;
        this.type = DeviceType.SCRIPT.getType();
        this.script = device;
    }
}
