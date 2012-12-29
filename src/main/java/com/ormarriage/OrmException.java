package com.ormarriage;

public class OrmException extends RuntimeException {
    public OrmException() {
    }

    public OrmException(String s) {
        super(s);
    }

    public OrmException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public OrmException(Throwable throwable) {
        super(throwable);
    }
}
