package com.ormarriage.core;

import com.ormarriage.core.statement.OrmStatement;

import java.sql.Connection;
import java.util.List;

public class SqlExec {
    public SqlExec(Connection conn) {

    }

    public <T> List<T> ToList(OrmStatement ormStatement) {
        return null;
    }

    public <T> T First(OrmStatement ormStatement) {
        return null;
    }
}
