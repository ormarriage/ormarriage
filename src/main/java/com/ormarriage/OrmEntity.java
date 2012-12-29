package com.ormarriage;

public interface OrmEntity {
    public Long getId();

    public void setId(Long id);

    public Long getRowVersion();

    public void setRowVersion(Long rowVersion);
}
