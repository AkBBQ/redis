package com.test.redis;

import com.test.redis.cache.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

	@Autowired
	private RedisService redisService;

	@Test
	public void contextLoads() {
		//从redis中读取key
		String name = redisService.getString("cat1");
		System.out.println(name);
		redisService.add("sunjie","sunjie");
	}

}
