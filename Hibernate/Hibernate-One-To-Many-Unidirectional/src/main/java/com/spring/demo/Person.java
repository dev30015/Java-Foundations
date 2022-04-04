package com.spring.demo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER, orphanRemoval=true)
	private Set<Phone> phones =  new HashSet<>();
	
	public Person() {
		super();
	}

	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Phone> getPhones() {
		return phones;
	}
	
	public void addPhones(Phone phone) {
		phones.add(phone);
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phones=" + phones + "]";
	}
	
}
