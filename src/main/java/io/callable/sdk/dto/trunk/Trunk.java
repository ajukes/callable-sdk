package io.callable.sdk.dto.trunk;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trunk {
    private String id;
    private String ip;
    private Integer port;
    private Integer priority;
    private String vendor;
    private Boolean monitored;
    private String callerFormat;
    private String calledFormat;
    private String description;
    private String zone;
    private String countryCode;
}
