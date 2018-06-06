package test;

import redis.clients.jedis.Jedis;

/**
 * @author lijunhao
 * @date 2018/05/23
 */
public class TestService {

    private static Jedis redis = null;

    public static void main(String[] args) {
        // 1.初始化
        redis = new Jedis("192.168.0.3", 9999, 5000);      //第二种方式 redis.clients 连接
        redis.auth("thisisredis");

        System.out.println("reids连接成功...");

        //1分钟有效
        redis.setex("expire_initiative_time:" + 1, 60, "0");
        //获取过期时间
        long time = redis.ttl("expire_initiative_time:" + 1);

        String s = redis.get("expire_initiative_time:" + 1);

        System.out.println("过期时间" + time+ "，值为："+ s);

        redis.close();
    }
}
