package com.ormarriage;

import java.sql.Connection;

public interface OrmConnectionProvider {
    public Connection getConnection();
}
