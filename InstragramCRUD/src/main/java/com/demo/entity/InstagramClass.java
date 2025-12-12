package com.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Instragram Users")
@Data
public class InstagramClass {

	@Id
	private int id;
	private String name;
	private String username;
	private int age;
	private String dob;
	private String password;
	private String about;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public InstagramClass(int id, String name, String username, int age, String dob, String password, String about) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.age = age;
		this.dob = dob;
		this.password = password;
		this.about = about;
	}

	@Override
	public String toString() {
		return "InstagramClass [id=" + id + ", name=" + name + ", username=" + username + ", age=" + age + ", dob="
				+ dob + ", password=" + password + ", about=" + about + "]";
	}

	public InstagramClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
