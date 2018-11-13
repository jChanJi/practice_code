package com.example.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
		RedisUtil redisUtil = new RedisUtil();
		redisUtil.set("redis-test","jichun");
		Object s = redisUtil.get("redis-test");
		System.out.println(s.toString());
	}
}
