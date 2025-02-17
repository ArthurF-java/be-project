package com.beproject.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@RequiredArgsConstructor
public class RedisConfig {

    private final RedisProperties redisProperties;

    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory() {
        final RedisStandaloneConfiguration serverConfig = getRedisStandaloneConfiguration(redisProperties);

        return new LettuceConnectionFactory(serverConfig);
    }

    private RedisStandaloneConfiguration getRedisStandaloneConfiguration(RedisProperties properties) {
        final RedisStandaloneConfiguration serverConfig = new RedisStandaloneConfiguration();

        serverConfig.setHostName(properties.getHost());
        serverConfig.setPort(properties.getPort());
        serverConfig.setUsername(properties.getUsername());
        serverConfig.setPassword(properties.getPassword());
        serverConfig.setDatabase(properties.getDatabase());

        return serverConfig;
    }

    @Bean
    public RedisTemplate<?, ?> redisTemplate() {
        RedisTemplate<String, String> template = new RedisTemplate<>();
        template.setConnectionFactory(lettuceConnectionFactory());
        return template;
    }
}
