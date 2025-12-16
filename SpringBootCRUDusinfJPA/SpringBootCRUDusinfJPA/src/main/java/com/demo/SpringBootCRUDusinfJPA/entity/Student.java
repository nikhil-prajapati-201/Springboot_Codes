package com.demo.SpringBootCRUDusinfJPA.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Student_Data_JPA")
@Data
public class Student {

    @Id
    private int id;
    private String name;
    private String city;
    private int age;


}
