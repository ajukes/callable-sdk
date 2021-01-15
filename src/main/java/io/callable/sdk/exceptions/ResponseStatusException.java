package io.callable.sdk.exceptions;

public class ResponseStatusException extends RuntimeException {

    public ResponseStatusException() {
        super("Invalid response from endpoint");
    }

    public ResponseStatusException(int statusCode) {
        super("Invalid response from endpoint status=" + statusCode);
    }

    public ResponseStatusException(int statusCode, String responseBody) {
        super("Invalid response from endpoint status=" + statusCode + " responseBody=" + responseBody);
    }

    public ResponseStatusException(String msg) {
        super(msg);
    }
}
