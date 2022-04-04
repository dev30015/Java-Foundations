package com.spring.demo;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class HibernateManyToManyUnidirectionalApplicationTests {

	@Resource
	private PersonRepository personRespo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	@Rollback(false)
	@Transactional
	void saveUser() {
		Person alan = new Person();
		alan.setName("Alan");
		Phone apple = new Phone("Apple");
		//apple.setId(new Long("1"));
		alan.addPhones(apple);
		Phone nokia = new Phone("Nokia");
		//nokia.setId(new Long("2"));
		alan.addPhones(nokia);
		
		Person alice = new Person();
		alice.setName("Alice");
		alice.addPhones(apple);
		alice.addPhones(nokia);
		personRespo.save(alan);
		personRespo.save(alice);
	}
	
	@Test
	void readUser() {
		List<Person> persons = personRespo.findAll();
		persons.forEach(person -> {
			System.out.println(person);
		});
	}

}
