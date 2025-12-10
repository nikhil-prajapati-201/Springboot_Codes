package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory sf;
	
	public String insertData(Employee e) {
		
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		ss.persist(e);
		ts.commit();
		ss.close();
		
		return "Data is Inserted";
		
	}
	
	public String getData(int id) {

		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		
		ss.load(Employee.class, id);
		ts.commit();
		ss.close();
		
		return "Data is Inserted";
		
	}
}
