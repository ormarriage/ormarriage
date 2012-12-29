package com.ormarriage.core;

import com.ormarriage.OrmConfig;
import com.ormarriage.core.statement.OrmStatement;

import java.sql.Connection;
import java.util.List;

public class SqlExec {
    private OrmConfig meta;
    private Connection conn;

    public SqlExec(Connection conn, OrmConfig meta) {
        this.meta = meta;
        this.conn = conn;
    }

    public <T> List<T> ToList(OrmStatement ormStatement) {
        return null;
    }

    public <T> T First(OrmStatement ormStatement) {
        return null;
    }

    public <T> List<T> ToPrimitiveList() {
        return null;
    }

    public <T> T FirstPrimitive() {
        return null;
    }

}
