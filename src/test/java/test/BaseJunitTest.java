package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jy.common.redis.RedisClientTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/spring-application.xml",
		"classpath*:spring/spring-quartz-task.xml", "classpath*:spring/spring-redis.xml" })
public class BaseJunitTest {

	@Test
	public void test1() {
		System.out.println("---55555555555555555555555----");
	}

	@Autowired
	RedisClientTemplate redisClientTemplate;

	@Test
	public void test2() {
		redisClientTemplate.setex("test1", 60, "hello world.");
		System.out.println(redisClientTemplate.get("test1"));
	}

}
