package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es ;
	
//	@GetMapping("/get/{id}")
//	public void getData(RequestParam int id) {
//		es.getData(id);
//	}
	
	
	@PostMapping("/add")
	public String insettData(@RequestBody Employee e) {
		return es.insertData(e);
	}
	
	@DeleteMapping("/delete/{id}")
	public String insertData(@PathVariable int id ) {
		return es.deleteData(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Employee e, @PathVariable int id) {
		return es.updateData(e,id);
	}
	
	@GetMapping("/get/{id}")
	public Employee getData(@PathVariable int id ) {
		Employee e = es.getData(id);
		return e;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllData() {
		List<Employee> list = es.getAllData();
		return list;
	}
	
	
}
