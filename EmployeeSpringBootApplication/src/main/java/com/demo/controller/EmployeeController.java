package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es ;
	
	@GetMapping("/get/{id}")
	public void getData(RequestParam int id) {
		es.getData(id);
	}
	
	
	@PostMapping("/add")
	public String insettData(@RequestBody Employee e) {
		return es.insertData(e);
	}
}
