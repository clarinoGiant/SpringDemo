package com.test.redis;

import redis.clients.jedis.Jedis;

public class JedisDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);

        jedis.lpush("key", "hello","world");
        // 方法名同原始的Redis命令
        System.out.println(jedis.lpop("key"));
    }
}
