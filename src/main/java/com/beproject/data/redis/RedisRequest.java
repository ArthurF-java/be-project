package com.beproject.data.redis;

public record RedisRequest(String key, String value, Long ttl) {
}
