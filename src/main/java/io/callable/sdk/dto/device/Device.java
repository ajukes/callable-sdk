package io.callable.sdk.dto.device;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.callable.sdk.dto.device.flow.*;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {
    private String id;
    private String type;
    private String name;
    private String extension;
    private Integer priority;
    private OutboundOverride outboundOverride;
    private TimeBasedRoute timeBasedRoute;
    private ANIRouter aniRouter;
    private DNISRouter dnisRouter;
    private StartRoute startRoute;
    private RegexRoute regexRoute;
    private NumberPlan numberPlan;
    private ZoneRouter zoneRouter;
    private HuntGroup huntGroup;
    private Client client;
    private Teams teams;
    private SipExtension sipExtension;
    private SipGateway sipGateway;
    private Remote remote;
    private Plugin plugin;
    private Play play;
    private Say say;
    private VoiceMail voicemail;
    private TimeRangeRoute timeRangeRoute;
    private DayOfWeekRoute dayOfWeekRoute;
    private DateRangeRoute dateRangeRoute;
    private Script script;
}
