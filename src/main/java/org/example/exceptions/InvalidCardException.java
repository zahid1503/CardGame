package org.example.exceptions;

public class InvalidCardException extends RuntimeException {

    public InvalidCardException() {
        super();
    }

    public InvalidCardException(String message) {
        super(message);
    }

}
