package com.demo.service;

import java.util.List;

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
	
	public String deleteData(int id) {
		return ed.deletetMethod(id);
	}

	public String updateData(Employee e, int id) {
		 return ed.updateData(e,id);

	}

	public Employee getData(int id) {
		Employee e = ed.getData(id);
		return e;
	}
	
	public List<Employee> getAllData() {
		List<Employee> list= ed.getAllData();
		return list;
	}
}
