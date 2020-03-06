package com.test.redis;

import com.test.redis.cache.RedisService;
import com.test.redis.dao.PersonDao;
import com.test.redis.model.Person;
import com.test.redis.service.PersonService;
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

	@Autowired
	private PersonService personService;

	@Autowired
	private PersonDao personDao;

	@Test
	public void contextLoads() {
		//从redis中读取key
		String name = redisService.getString("cat1");
		System.out.println(name);
		redisService.add("sunjie","sunjie");

	}

	/**
	 * myBatisPlus add Test
	 */
	@Test
	public void addTest(){
		personService.insert(Person.builder().name("孙杰").age(12).build());
	}

}
