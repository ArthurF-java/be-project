package com.beproject.controller;

import com.beproject.data.redis.RedisRequest;
import com.beproject.data.redis.RedisResponse;
import com.beproject.service.CacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cache")
public class CacheController {

    private final CacheService cacheService;

    @GetMapping()
    public ResponseEntity<RedisResponse> getByKey(@RequestParam String key) {
        return ResponseEntity.ok(cacheService.getByKey(key));
    }

    @PostMapping
    public ResponseEntity<?> saveData(@RequestBody RedisRequest redisRequest) {
        cacheService.saveData(redisRequest);
        return ResponseEntity.ok().build();
    }
}
