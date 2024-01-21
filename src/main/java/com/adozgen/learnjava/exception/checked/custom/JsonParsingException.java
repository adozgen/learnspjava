package com.adozgen.learnjava.exception.checked.custom;

public class JsonParsingException extends Exception {
    public JsonParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}