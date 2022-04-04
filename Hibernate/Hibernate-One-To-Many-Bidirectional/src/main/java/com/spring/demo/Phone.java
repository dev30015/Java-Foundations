package com.spring.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="phone_model")
	private String phoneModel;
	
	@ManyToOne
	private Person person;

	public Phone() {
		super();
	}	
	
	public Phone(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	
	public Phone(Long id, String phoneModel) {
		super();
		this.id = id;
		this.phoneModel = phoneModel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneModel=" + phoneModel + "]";
	}
	
	
}
