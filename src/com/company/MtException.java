package com.company;

public class MtException extends Throwable{
    public MtException() {
        super();
    }

    public MtException(String message) {
        super(message);
    }

    public MtException(String message, Throwable cause) {
        super(message, cause);
    }
}
