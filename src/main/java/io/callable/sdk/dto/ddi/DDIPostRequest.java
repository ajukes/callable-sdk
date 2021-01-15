package io.callable.sdk.dto.ddi;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class DDIPostRequest {
    List<DDI> ddis;
}
