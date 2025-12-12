package com.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.InstragramDao;
import com.demo.entity.InstagramClass;

@Service
public class InstragramService {

	@Autowired
	InstragramDao id;

	public String insertData(InstagramClass i) {

		String msg = id.insertData(i);
		if (Objects.isNull(msg)) {
			msg = "Data is Not Inserted";
		}
		return msg;

	}
	
	public String updateData(InstagramClass i, int idd) {

		String msg = id.updateData(i,idd);
		if (Objects.isNull(msg)) {
			msg = "Data is Not Updated";
		}
		return msg;

	}

	public List<InstagramClass> getData() {

		List<InstagramClass> list = id.getData();
		if (Objects.isNull(list)) {
			list = null;
		}
		return list;

	}

	public String deleteData(int id2) {
		String msg = id.deleteData(id2);
		if (Objects.isNull(msg)) {
			msg = "Data is Not Deleted";
		}
		return msg;
	}
}
