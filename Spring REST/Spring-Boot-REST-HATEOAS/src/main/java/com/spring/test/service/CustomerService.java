package com.spring.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.spring.test.domain.Customer;

@Service
public interface CustomerService {
	List<Customer> findCustomers();
	Optional<Customer> getCustomer(Long id);
}
