package org.example.exceptions;

public class EmptyHandException extends RuntimeException {

    public EmptyHandException() {
        super();
    }

    public EmptyHandException(String message) {
        super(message);
    }
}
