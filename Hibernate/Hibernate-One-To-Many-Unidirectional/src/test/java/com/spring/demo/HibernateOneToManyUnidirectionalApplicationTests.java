package com.spring.demo;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class HibernateOneToManyUnidirectionalApplicationTests {

	@Resource
	private PersonRepository personRespo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	@Rollback(false)
	void saveUser() {
		Person person = new Person();
		person.setName("Alan");
		Phone apple = new Phone("Apple");	
		person.addPhones(apple);
		Phone nokia = new Phone("Nokia");
		person.addPhones(nokia);
		personRespo.save(person);
	}
	
	@Test
	void readUser() {
		List<Person> persons = personRespo.findAll();
		persons.forEach(person -> {
			System.out.println(person);
		});
	}

}
