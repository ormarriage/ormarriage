package com.ormarriage;

import java.util.Date;

public interface OrmDateAwareEntity extends OrmEntity {
    public Date getCreateDate();

    public void setCreateDate(Date createDate);

    public Date getUpdateDate();

    public void setUpdateDate(Date updateDate);
}
