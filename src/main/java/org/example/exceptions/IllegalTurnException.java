package org.example.exceptions;

public class IllegalTurnException extends RuntimeException {

    public IllegalTurnException() {
        super();
    }

    public IllegalTurnException(String message) {
        super(message);
    }
}
