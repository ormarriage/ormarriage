package com.ormarriage;

import java.sql.Connection;

public interface OrmSession {
    public Connection getConnection();
    public <T extends OrmEntity> T FindById(long id, String[] includes) ;
    public <T extends OrmEntity> EntityQuery<T> CreateEntityQuery();
    public SqlQuery CreateSqlQuery(String sql);
    public <T extends OrmEntity> T Add(T entity);
    public <T extends OrmEntity> T Update(T modified, T original, String[] includes);
    public <T extends OrmEntity> void Delete(Long id);
}
