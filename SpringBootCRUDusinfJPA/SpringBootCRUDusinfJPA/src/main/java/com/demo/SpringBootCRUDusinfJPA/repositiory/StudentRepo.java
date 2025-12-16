package com.demo.SpringBootCRUDusinfJPA.repositiory;

import com.demo.SpringBootCRUDusinfJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<Student, Integer> {
}
