package com.ormarriage.impl;

import com.google.common.collect.*;

import java.util.List;

public class OrmMetaCache {
    private BiMap<Class, String> typeToTableName = HashBiMap.create(100);

    public OrmMetaCache(List<String> packagesToScan) {


    }
}
