package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue
	private Long phoneId;
	
	@Column(name="phone_model")
	private String phoneModel;
	
	public Phone() {
		
	}
	
	public Phone(String phoneModel) {
		this.phoneModel=phoneModel;
	}

	public Long getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(Long phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", phoneModel=" + phoneModel + "]";
	}
	
}
