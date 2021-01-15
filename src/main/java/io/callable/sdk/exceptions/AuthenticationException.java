package io.callable.sdk.exceptions;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException() {
        super("Could not authenticate callable user");
    }
}
