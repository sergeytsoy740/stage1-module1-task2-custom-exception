package com.epam.mjc;

public class IdNotExistsException extends IllegalArgumentException {
    public IdNotExistsException(String message) {
        super(message);
    }
}
