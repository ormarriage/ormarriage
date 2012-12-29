package com.ormarriage.core.statement;

import com.ormarriage.core.SqlExec;
import com.ormarriage.util.OrmInternalUtil;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;

public abstract class OrmStatement {

    protected abstract SqlConstructor GetSqlConstructor();
    private HashMap<String, Object> params;
    public <T> List<T> ToList(Connection conn)
    {
        return new SqlExec(conn).ToList(this);
    }

    public <T> T First(Connection conn)
    {
        return new SqlExec(conn).First(this);
    }
    public OrmStatement AddParam(String key, Object value)
    {
        if(value ==null || OrmInternalUtil.IsEmptyList(value))
        {
            if (params.containsKey(key)) params.remove(key);
            return this;
        }
        return this;
    }
}
