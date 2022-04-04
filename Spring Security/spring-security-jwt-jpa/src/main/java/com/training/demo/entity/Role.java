package com.training.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rid")
	private long rid;

	@Column(name = "role_name")
	private String roleName;

	@Column(name = "role_description")
	private String roleDescription;

	// @ManyToMany(targetEntity=User.class,mappedBy="roles",fetch = FetchType.EAGER)
	//@LazyCollection(LazyCollectionOption.FALSE)
	//@ManyToMany(targetEntity = User.class, mappedBy = "roles")
	//@ManyToMany(targetEntity=User.class,mappedBy="roles",fetch = FetchType.EAGER)
	@ManyToMany(mappedBy = "roles")
	private Set<User> users;

	public Role() {

	}

	public Role(String roleName, String roleDescription) {
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public long getRid() {
		return rid;
	}

	public void setRid(long rid) {
		this.rid = rid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public void addUser(User user) {

		if (this.users == null) {
			this.users = new HashSet<User>();
		}

		this.users.add(user);
	}

}