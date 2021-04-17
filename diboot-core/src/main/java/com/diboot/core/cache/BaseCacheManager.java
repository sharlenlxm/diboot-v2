package com.diboot.core.cache;

import org.springframework.cache.Cache;
import org.springframework.cache.support.AbstractCacheManager;

import java.util.Collection;

/**
 * 缓存manager父类
 * @author JerryMa
 * @version v2.2.1
 * @date 2021/4/17
 * Copyright © diboot.com
 */
public abstract class BaseCacheManager extends AbstractCacheManager {

    /**
     * 获取缓存对象
     * @param objKey
     * @param <T>
     * @return
     */
    public <T> T getCacheObj(String cacheName, Object objKey, Class<T> tClass){
        Cache cache = getCache(cacheName);
        return cache != null? cache.get(objKey, tClass) : null;
    }

    /**
     * 缓存对象
     * @param cacheName
     * @param objKey
     * @param obj
     */
    public void putCacheObj(String cacheName, Object objKey, Object obj){
        Cache cache = getCache(cacheName);
        cache.put(objKey, obj);
    }

    @Override
    protected Collection<? extends Cache> loadCaches() {
        return null;
    }
}
