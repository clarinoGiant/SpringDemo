package com.test.redis;

import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

public class StringRedisTemplateDemo {

    public static RedisConnectionFactory redisCF() {
        JedisConnectionFactory cf = new JedisConnectionFactory();
        return cf;
    }

    public static void main(String[] args) {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(redisCF());

        StringRedisSerializer serializer = new StringRedisSerializer();
        stringRedisTemplate.setDefaultSerializer(serializer);
        stringRedisTemplate.setKeySerializer(serializer);
        stringRedisTemplate.setValueSerializer(serializer);

        /**必须执行这个函数,初始化RedisTemplate*/
        stringRedisTemplate.afterPropertiesSet();

        stringRedisTemplate.opsForHash().put("hashValue","map1","map1-1");

        System.out.println(stringRedisTemplate.opsForHash().values("hashValue"));

        System.out.println(stringRedisTemplate.opsForHash().get("hashValue","map1"));
    }
}
