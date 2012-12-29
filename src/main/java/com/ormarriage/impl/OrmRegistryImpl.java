package com.ormarriage.impl;

import com.ormarriage.OrmConfig;
import com.ormarriage.OrmRegistry;

import javax.inject.Inject;

public class OrmRegistryImpl implements OrmRegistry {
    private OrmConfig config;
    private OrmMetaCache metaCache;

    @Inject
    public OrmRegistryImpl(OrmConfig config) {
        this.config = config;
        metaCache = new OrmMetaCache(config.getEntityPackageList());
    }

    @Override
    public OrmMetaCache getMetaCache() {
        return metaCache;
    }
}
