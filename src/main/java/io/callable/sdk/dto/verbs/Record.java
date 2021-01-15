package io.callable.sdk.dto.verbs;

import lombok.Getter;

@Getter
public class Record {
    private String url;
    private String username;
    private String password;

    public Record(String url) {
        this.url = url;
    }

    public Record(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
}
