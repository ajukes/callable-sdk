package io.callable.sdk.exceptions;

public class FileToLargeException extends RuntimeException {
    public FileToLargeException() {
        super("Please upload a file < 100 mb");
    }
}
