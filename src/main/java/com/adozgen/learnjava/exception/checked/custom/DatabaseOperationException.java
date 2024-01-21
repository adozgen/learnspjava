package com.adozgen.learnjava.exception.checked.custom;

public class DatabaseOperationException extends Exception {
    public DatabaseOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
