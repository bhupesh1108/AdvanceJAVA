package com.demo.dao;

import com.demo.model.EmpleaveDetails;

public interface EmpDao {

	EmpleaveDetails getData();

	void add(EmpleaveDetails p);

	EmpleaveDetails getall();

}
