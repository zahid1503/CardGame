package org.example.exceptions;

public class NoSuchCommandException extends RuntimeException {

    public NoSuchCommandException() {
        super();
    }

    public NoSuchCommandException(String message) {
        super(message);
    }
}
