package com.cg.service;

import java.util.Collection;

import javax.ws.rs.core.Response;

import com.cg.dao.EmpRepo;
import com.cg.exception.EmployeeNotFoundException;
import com.cg.model.EmployeeModel;


public class EmpServiceImpl implements EmpService {
	private final EmpRepo empRepo;

	public EmpServiceImpl(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}

	@Override
	public Collection<EmployeeModel> getAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public Response getById(int id) {
		EmployeeModel emp = empRepo.findById(id).orElseThrow(EmployeeNotFoundException::new);
		return Response.ok(emp).build();
	}

}
