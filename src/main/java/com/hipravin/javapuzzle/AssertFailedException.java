package com.hipravin.javapuzzle;

public class AssertFailedException extends RuntimeException{

    public AssertFailedException() {
    }

    public AssertFailedException(String message) {
        super(message);
    }

    public AssertFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public AssertFailedException(Throwable cause) {
        super(cause);
    }

    public AssertFailedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
