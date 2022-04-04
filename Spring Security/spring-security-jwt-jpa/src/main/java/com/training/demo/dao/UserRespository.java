package com.training.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.training.demo.entity.User;

@Repository
public interface UserRespository extends JpaRepository<User,Long> {
	
	/*public List<User> findAll();*/
	
	public User findByUsername(String username);
	
	@Query(value = "SELECT * FROM Users", nativeQuery = true)
	public List<User> getUsers();
	
	//public void save(User user);
	/*
	@Query("select u from User u where u.name = :name")
	public User findByNameCustomQuery(@Param("name")String name);
	*/
}
