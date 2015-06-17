package com.naturalprogrammer.spring.boot.domain;

import java.io.Serializable;
import java.util.Set;

import com.naturalprogrammer.spring.boot.domain.BaseUser.Role;

public class UserDto<ID extends Serializable> {
	
	private ID id;
	private String name;
	Set<Role> roles;
	
	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", name=" + name + ", roles=" + roles
				+ "]";
	}

}