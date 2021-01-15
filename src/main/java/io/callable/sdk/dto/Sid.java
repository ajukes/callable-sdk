package io.callable.sdk.dto;

import lombok.Getter;

@Getter
public class Sid {
    private String sid;

    public Sid(String sid) {
        this.sid = sid;
    }
}
