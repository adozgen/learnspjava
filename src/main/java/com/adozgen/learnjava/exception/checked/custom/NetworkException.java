package com.adozgen.learnjava.exception.checked.custom;

public class NetworkException extends Exception {
    public NetworkException(String message, Throwable cause){
        super(message,cause);
    }
}
