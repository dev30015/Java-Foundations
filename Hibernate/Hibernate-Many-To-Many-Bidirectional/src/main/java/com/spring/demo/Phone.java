package com.spring.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(mappedBy = "phones")
	private List<Person> owners = new ArrayList<>();

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
	
	public List<Person> getOwners() {
		return owners;
	}

	public void setOwners(List<Person> owners) {
		this.owners = owners;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneModel=" + phoneModel + "]";
	}
	
	
}
