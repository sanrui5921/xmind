package org.sunrain.study.utils.bloomfilter.redis;

import redis.clients.jedis.Pipeline;

@FunctionalInterface
public interface PipelineExecutor {
    void load(Pipeline pipeline);
}
