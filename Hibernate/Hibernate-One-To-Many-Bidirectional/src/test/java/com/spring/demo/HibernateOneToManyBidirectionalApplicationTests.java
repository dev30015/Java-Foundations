package com.spring.demo;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.internal.build.AllowSysOut;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
class HibernateOneToManyBidirectionalApplicationTests {

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
		alan.addPhone(apple);
		Phone nokia = new Phone("Nokia");
		alan.addPhone(nokia);
		
		Person wayne = new Person();
		wayne.setName("Wayne");
		wayne.addPhone(new Phone("Samsung"));
		wayne.addPhone(new Phone("OPPO"));
		
		personRespo.save(alan);
		personRespo.save(wayne);
	}
	
	@Test
	@Transactional
	void readUser() {
		List<Person> persons = personRespo.findAll();
		persons.forEach(person -> {
			//System.out.println(person.getPhones());
			System.out.println(person);
		});
	}

}
