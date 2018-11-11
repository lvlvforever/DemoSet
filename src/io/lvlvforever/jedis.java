package io.lvlvforever;

import redis.clients.jedis.Jedis;

public class jedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        jedis.set("name", "daipeng");
        System.err.println(jedis.get("name"));



    }
}
