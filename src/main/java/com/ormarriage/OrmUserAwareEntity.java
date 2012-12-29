package com.ormarriage;

public interface OrmUserAwareEntity extends OrmDateAwareEntity {
    public Long getCreator_Id();
    public void setCreator_Id(Long creatorId);
    public Long getUpdater_Id();
    public void setUpdater_Id(Long updaterId);
}
