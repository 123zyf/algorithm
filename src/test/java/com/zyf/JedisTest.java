package com.zyf;

import org.junit.jupiter.api.BeforeEach;
import redis.clients.jedis.Jedis;

/**
@author zyf
@Data 2024/2/5 - 16:11
*/
public class JedisTest {
    private Jedis jedis ;

    @BeforeEach
    void setUp() {
        new Jedis("127.0.0.0",6379);
    }
}
