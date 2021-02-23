package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.cg.model.EmployeeModel;

@Repository
public class EmpRepo {
	Map<Integer, EmployeeModel> emps = new HashMap<>();

	@PostConstruct
	public void init() {
		emps.put(1, new EmployeeModel(101, "Piysuh", "9899057463"));
		emps.put(2, new EmployeeModel(102, "Ayush", "1234567891"));
		emps.put(3, new EmployeeModel(103, "Mayank", "98765443210"));
	}

	public Collection<EmployeeModel> findAll() {
		return emps.values();
	}

	public Optional<EmployeeModel> findById(int id) {
		EmployeeModel emp = null;
		if (emps.containsKey(id))
			emp = emps.get(id);
		return Optional.ofNullable(emp);
	}
}
