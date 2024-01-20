package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmpDao;
import com.demo.model.EmpleaveDetails;
@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao edao;
	
	public EmpleaveDetails getdata() {
		
		return edao.getData();
	}

	public void addnewleave(EmpleaveDetails p) {
		edao.add(p);
		
	}

	public EmpleaveDetails getall() {
		// TODO Auto-generated method stub
		return edao.getall();
	}

}
