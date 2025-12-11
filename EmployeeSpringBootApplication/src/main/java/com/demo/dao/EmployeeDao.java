package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
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
	
	public String deletetMethod(int id) {

		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		Employee emp = ss.get(Employee.class, id);
		
		ss.remove(emp);
		ts.commit();
		ss.close();

		return "Data Deleted....";

	}


	public String updateData(Employee e, int id) {
		
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Employee emp = ss.get(Employee.class, id);
		
		emp.setAge(e.getAge());
		emp.setCity(e.getCity());
		emp.setEmail(e.getEmail());
		emp.setName(e.getName());
		emp.setSallry(e.getSallry());
		
		ss.merge(emp);
		ts.commit();
		ss.close();
		
		return "Data is Updated";
	}

	public Employee getData(int id) {
		
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Employee emp = ss.get(Employee.class, id);
	
		return emp;
	}
	
public List<Employee> getAllData() {
		
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Query<Employee> list = ss.createQuery("from Employee", Employee.class);
		List<Employee> li = list.getResultList();
	
		return li;
	}

	
	
}
