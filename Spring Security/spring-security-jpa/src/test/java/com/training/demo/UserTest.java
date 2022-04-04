package com.training.demo;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.dao.UserRespository;
import com.training.models.User;

//@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@DataJpaTest
//@SpringBootTest
@SpringBootTest(classes = SpringSecurityJpaApplication.class)
class UserTest {

	@Resource
	private UserRespository udao;
	
	@Test
	void test() {
		User user = udao.findByUsername("admin");
		System.out.println(user);
	}

}
