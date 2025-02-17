package com.beproject.service;

import com.beproject.data.redis.RedisRequest;
import com.beproject.data.redis.RedisResponse;

public interface CacheService {
    RedisResponse getByKey(String key);

    void saveData(RedisRequest redisRequest);
}
