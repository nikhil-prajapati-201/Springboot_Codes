package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Data")
public class Employee {

	@Id
	int id;
	String name;
	String email;
	String sallry;
	String city;
	int age;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String email, String sallry, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.sallry = sallry;
		this.city = city;
		this.age = age;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSallry() {
		return sallry;
	}

	public void setSallry(String sallry) {
		this.sallry = sallry;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", sallry=" + sallry + ", city=" + city
				+ ", age=" + age + "]";
	}

}
