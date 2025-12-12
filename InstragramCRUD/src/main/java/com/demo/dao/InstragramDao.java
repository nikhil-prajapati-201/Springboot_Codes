package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.entity.InstagramClass;

@Repository
public class InstragramDao {

	@Autowired
	SessionFactory sf;

	Session ss = null;
	Transaction ts = null;
	String msg = null;

	public String insertData(InstagramClass i) {
		try {
			ss = sf.openSession();
			ts = ss.beginTransaction();

			ss.persist(i);
			ts.commit();
			ss.close();
			msg = "Data is Inserted...";
		} catch (Exception e) {
			if (ts != null) {
				ts.rollback();
			}
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return msg;
	}
	
	public String updateData(InstagramClass i, int id) {
		try {
			ss = sf.openSession();
			ts = ss.beginTransaction();

			InstagramClass user = ss.get(InstagramClass.class, id);
			user.setAbout(i.getAbout());
			user.setAge(i.getAge());
			user.setDob(i.getDob());
			user.setName(i.getName());
			user.setPassword(i.getPassword());
			user.setUsername(i.getUsername());;
			
			ss.merge(user);
			ts.commit();
			ss.close();
			msg = "Data is Updated...";
			
		} catch (Exception e) {
			if (ts != null) {
				ts.rollback();
			}
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return msg;
	}

	public List<InstagramClass> getData() {
		List<InstagramClass> list = null;
		try {
			ss = sf.openSession();
			ts = ss.beginTransaction();

			Query<InstagramClass> li = ss.createQuery("from InstagramClass", InstagramClass.class);
			list = li.getResultList();
			ts.commit();
			ss.close();
		} catch (Exception e) {
			if (ts != null) {
				ts.rollback();
			}
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return list;
	}

	public String deleteData(int id2) {
		try {
			ss = sf.openSession();
			ts = ss.beginTransaction();

			InstagramClass user = ss.get(InstagramClass.class, id2);
			
			
			ss.remove(user);
			ts.commit();
			ss.close();
			msg = "Data is Deleted...";
			
		} catch (Exception e) {
			if (ts != null) {
				ts.rollback();
			}
		} finally {
			if (ss != null) {
				ss.close();
			}
		}
		return msg;
	}

}
