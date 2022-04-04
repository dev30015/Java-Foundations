package com.spring.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.domain.Customer;
import com.spring.test.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return customerService.findCustomers();
	}
	
	@GetMapping("customer/{customerId}")
    public Optional<Customer> getCustomerById(@PathVariable String customerId) {
        return customerService.getCustomer(Long.parseLong(customerId));
    }
}
