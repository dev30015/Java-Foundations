package com.spring.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="phone_model")
	private String phoneModel;

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

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneModel=" + phoneModel + "]";
	}
	
	
}
