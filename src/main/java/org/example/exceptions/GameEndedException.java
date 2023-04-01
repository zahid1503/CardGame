package org.example.exceptions;

public class GameEndedException extends RuntimeException {

    public GameEndedException() {
        super();
    }

    public GameEndedException(String message) {
        super(message);
    }
}
