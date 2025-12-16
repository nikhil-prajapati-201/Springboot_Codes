package com.demo.SpringBootCRUDusinfJPA.controller;

import com.demo.SpringBootCRUDusinfJPA.entity.Student;
import com.demo.SpringBootCRUDusinfJPA.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("/get")
    public List<Student> getAllData(){
        return s.getAllData();
    }

    @GetMapping("/get/{id}")
    public Student getSingleData(@PathVariable int id){
        return s.getSingleData(id);
    }

    @PostMapping("/addStudent")
    public String insertData(@RequestBody Student std){

        return s.insertData(std);
    }
    
    @PutMapping("/update/{id}")
    public Student updateData(@RequestBody Student std, @PathVariable int id){

        return s.updatetData(std,id);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deletData(@PathVariable int id){
        return s.DeleteData(id);
    }
}
