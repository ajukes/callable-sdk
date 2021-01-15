package io.callable.sdk.dto.setting;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Settings {
    private String id;
    private String key;
    private String type;
    private String value;
}
