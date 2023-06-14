package com.siarhei.bean;

import java.util.Objects;

public class User {
	private String name;
	private int age;
	private String email;
	private String role;	
	
	public User() {}

	public User(String name, int age, String email, String role) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, email, name, role);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(name, other.name)
				&& Objects.equals(role, other.role);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", role=" + role + "]";
	}
	
	

	
	
	
	
	

}
