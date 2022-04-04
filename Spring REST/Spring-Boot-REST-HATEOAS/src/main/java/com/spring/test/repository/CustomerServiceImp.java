package com.spring.test.repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.test.domain.Customer;
import com.spring.test.service.CustomerService;

/***
 * Manual Experiment
 * @author Think Station
 *
 */
@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRespo;
	//manual injection
	private HashMap<Long,Customer> customers;
	
	public CustomerServiceImp() {
		this.customers=new HashMap<>(); 
		 //loading in test data
		customers.put((long)1, new Customer(1,"Alan"));
		customers.put((long)2, new Customer(2,"Wayne"));
		customers.put((long)3, new Customer(3,"Richard"));
	}
	
	public List<Customer> findCustomers() {
		List<Customer> customers = new LinkedList<>();
		this.customers.forEach((k,v)->customers.add(v));
		return customers;
	}

	@Override
	public Optional<Customer> getCustomer(Long id) {
		return Optional.of(customers.get(id));
		/*
		 * Using the H2 Database
		 * return customerRespo.findById(id);
		 */
	}
}
