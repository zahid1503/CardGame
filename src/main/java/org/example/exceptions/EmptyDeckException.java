package org.example.exceptions;

public class EmptyDeckException extends RuntimeException {

    public EmptyDeckException() {
        super();
    }

    public EmptyDeckException(String message) {
        super(message);
    }
}
