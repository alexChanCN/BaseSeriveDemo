package com.cs.basedemo;

import com.cs.basedemo.model.User;
import com.cs.basedemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseServiceApplicationTests {

	@Autowired
	UserService<User> service;

	@Test
	public void contextLoads() {
	}



	@Test
	public void testSave(){
		User user = new User();
		user.setUsername("xxx");
		user.setPassword("123456");
		service.save(user);
	}
}
