package com.demo.SpringBootCRUDusinfJPA.service;

import com.demo.SpringBootCRUDusinfJPA.entity.Student;
import com.demo.SpringBootCRUDusinfJPA.repositiory.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static java.lang.Character.getName;

@Service
public class StudentService {

    @Autowired
    StudentRepo repos;

    //InsertData
    public String insertData(Student std){

        repos.save(std);
        return "Data is Inserted";
    }

    //UpdateData
    public Student updatetData(Student std,int id){
        Student s = repos.getReferenceById(id);
        s.setAge(std.getAge());
        s.setName(std.getName());
        s.setCity(std.getCity());

       return repos.save(s);

    }

    //DeleteData
    public String DeleteData(int id){

        Student s = repos.getReferenceById(id);
        repos.delete(s);

        return "Data is Deleted";
    }

    //GetAllData
    public List<Student> getAllData(){

        List<Student> list = repos.findAll();
        return list;
    }

    public Student getSingleData(int id){

         return repos.getOne(id);
    }
}
