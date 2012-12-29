package com.ormarriage.impl;

import com.ormarriage.*;
import com.ormarriage.OrmEntity;

import javax.inject.Inject;
import java.sql.Connection;

public class OrmSessionImpl implements OrmSession {
    private Connection conn;
    private OrmRegistry registry;

    @Inject
    public OrmSessionImpl(OrmConnectionProvider connectionProvider, OrmRegistry registry) {
        conn = connectionProvider.getConnection();
        this.registry = registry;
    }

    @Override
    public Connection getConnection() {
        return conn;
    }

    @Override
    public <T extends OrmEntity> T FindById(long id, String[] includes) {
        return null;
    }

    @Override
    public <T extends OrmEntity> EntityQuery<T> CreateEntityQuery() {
        return null;
    }

    @Override
    public SqlQuery CreateSqlQuery(String sql) {
        return null;
    }

    @Override
    public <T extends OrmEntity> T Add(T entity) {
        return null;
    }

    @Override
    public <T extends OrmEntity> T Update(T modified, T original, String[] includes) {
        return null;
    }

    @Override
    public <T extends OrmEntity> void Delete(Long id) {

    }
}
