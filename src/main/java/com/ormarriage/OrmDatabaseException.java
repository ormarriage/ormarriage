package com.ormarriage;

public class OrmDatabaseException extends RuntimeException {

    public OrmDatabaseException() {
    }

    public OrmDatabaseException(String s) {
        super(s);
    }

    public OrmDatabaseException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public OrmDatabaseException(Throwable throwable) {
        super(throwable);
    }
}
