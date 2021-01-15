package io.callable.sdk.exceptions;

public class NullBodyException extends RuntimeException {
    public NullBodyException() {
        super("Could not obtain response body");
    }
}
