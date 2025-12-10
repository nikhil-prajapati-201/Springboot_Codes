package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed ;
	
	public String insertData(Employee e) {
		return ed.insertData(e);
	}
	
	public String getData(int id) {
		return ed.getData(id);
	}
}
