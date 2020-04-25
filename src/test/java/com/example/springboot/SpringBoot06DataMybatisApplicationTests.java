package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringBoot06DataMybatisApplicationTests {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
		System.out.println(jdbcTemplate.getClass());
	}

}
