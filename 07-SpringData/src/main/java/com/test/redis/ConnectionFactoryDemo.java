package com.test.redis;

import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;

public class ConnectionFactoryDemo {

    public static RedisConnectionFactory redisCF() {
//        return new JedisConnectionFactory();
        JedisConnectionFactory cf = new JedisConnectionFactory();
//        cf.setHostName("localhost");
//        cf.setPort(6379);
        return cf;
    }

    public static RedisConnectionFactory redisCFWithPassword() {
        JedisConnectionFactory cf = new JedisConnectionFactory();
        cf.setHostName("redis-server");
        cf.setPort(7379);
        cf.setPassword("foobared");
        return cf;
    }

    public static void main(String[] args) {
        RedisConnectionFactory redisConnectionFactory = redisCF();

        RedisConnection connection = redisConnectionFactory.getConnection();

        connection.set("hello".getBytes(), "world".getBytes());
        System.out.println(new String(connection.get("hello".getBytes())));
    }
}
