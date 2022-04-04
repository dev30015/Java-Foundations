package com.spring.test.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.test.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
