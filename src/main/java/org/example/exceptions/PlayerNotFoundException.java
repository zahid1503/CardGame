package org.example.exceptions;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException() {
        super();
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }
}
