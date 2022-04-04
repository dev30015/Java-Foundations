package com.spring.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.test.domain.Customer;
import com.spring.test.service.CustomerService;

@SpringBootTest
class CustomerTest {
	
	@Autowired
	private CustomerService customerService;
	
	@Test
	void testUsers() {
		List<Customer> customers = customerService.findCustomers();
		for(Customer customer: customers) {
			System.out.println(customer);
		}
	}

}
