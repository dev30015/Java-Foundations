package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class PhoneTest {
	
	@Resource
	private PersonRepository personRespo;
	
	@Rollback(false)
	@Test
	void saveTest() {
		Person person = new Person();
		person.setName("Alan");
		
		Phone phone = new Phone();
		phone.setPhoneModel("Nokia");
		
		person.setPhone(phone);
		System.out.println(person);
		personRespo.save(person);
	
	}
	
	@Test
	void readTest() {
		List<Person> persons = personRespo.findAll();
		persons.forEach(p -> {
			System.out.println(p);
			System.out.println(p.getPhone());
		});
	}

}
