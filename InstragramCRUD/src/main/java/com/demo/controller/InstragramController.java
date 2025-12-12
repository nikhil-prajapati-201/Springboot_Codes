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

import com.demo.entity.InstagramClass;
import com.demo.service.InstragramService;

@RestController
public class InstragramController {

	@Autowired
	InstragramService is;
	
	@PostMapping("/add")
	public String insertData(@RequestBody InstagramClass i) {
		return is.insertData(i);
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@RequestBody InstagramClass i, @PathVariable int id) {
		return is.updateData(i, id);
	}
	
	@GetMapping("/get")
	public List<InstagramClass> getData(){
		return is.getData();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable int id) {
		return is.deleteData(id);
	}
	
}
