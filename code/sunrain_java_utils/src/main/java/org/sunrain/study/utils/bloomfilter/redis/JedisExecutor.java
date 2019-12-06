package org.sunrain.study.utils.bloomfilter.redis;

import redis.clients.jedis.Jedis;

@FunctionalInterface
public interface JedisExecutor<T> {
    T execute(Jedis jedis);
}
