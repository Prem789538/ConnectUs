package org.me.model;

import java.util.Arrays;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	private String description;
	private String[] skills;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name) {
		this.name = name;
	}
	
	
	public User(int id, String name, String email, String password, String description, String[] skills) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.description = description;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getSkills() {
		return skills;
	}
	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", description=" + description
				+ ", skills=" + Arrays.toString(skills) + "]";
	}
	
	
	
	
}
