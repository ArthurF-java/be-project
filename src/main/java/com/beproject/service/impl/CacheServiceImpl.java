package com.beproject.service.impl;

import com.beproject.data.redis.RedisRequest;
import com.beproject.data.redis.RedisResponse;
import com.beproject.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class CacheServiceImpl implements CacheService {

    private final RedisTemplate<String, Object> redisTemplate;

    @Override
    public RedisResponse getByKey(String key) {
        String value = (String) redisTemplate.opsForValue().get(key);
        if (value == null) {
            return new RedisResponse(null, null);
        }
        return new RedisResponse(key, value);
    }

    @Override
    public void saveData(RedisRequest redisRequest) {
        redisTemplate.opsForValue().set(redisRequest.key(), redisRequest.value());
        redisTemplate.expire(redisRequest.key(), Duration.ofSeconds(redisRequest.ttl()));
    }
}
