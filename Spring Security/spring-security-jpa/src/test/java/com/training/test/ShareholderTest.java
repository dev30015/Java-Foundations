package com.training.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.training.dao.UserRespository;
import com.training.demo.SpringSecurityJpaApplication;
import com.training.models.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringSecurityJpaApplication.class)
class ShareholderTest {
	
	@Resource
	private UserRespository udao;
	
	
	@Test
	public void testAddUser() {
		User testUser = new User("testUser","testPassword");
		testUser.setEmail("test@test.com");
		System.out.println("Test user is "+testUser);
		udao.save(testUser);	
	}
	
	@Test
	public void testOneUser() {
		System.out.println("Test One User");
		User dbUser = udao.findByUsername("admin");
		System.out.println("DB user is "+dbUser);
	}
	
	
	@Test
	public void listAllUsers() {
		System.out.println("Test All Users");
		
		List<User> users = udao.findAll();
		
		System.out.println("User size "+users.size());
		for(User user:users) {
			System.out.println(user);
		}
		
		/*
		List<User> queryUsers = udao.getUsers();
		System.out.println("Query user size"+queryUsers.size());
		for(User user:queryUsers) {
			System.out.println(user);
		}
		*/
		System.out.println("gg");
		
		
	}
	/*
	@Test
	@Rollback(value = false)
	public void testNewShareholder() {
		System.out.println("fuck you");
		//User user = userService.findByUsername("admin");
		//System.out.println(user);
	}
	*/
	
}
