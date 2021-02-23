package com.cg.service;

import java.util.List;

import java.util.stream.Collectors;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmpMongoRepo;
import com.cg.entity.Employee;
import com.cg.model.EmployeeModel;

/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee Service Implementation
 * 
 *******************************************************************************************************************************/
@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMongoRepo empRepo;
	
	//Finding out the Entity by Id
	@Override
	public Response findById(int id) {
		EmployeeModel emp = of(empRepo.findById(id).get());
		return Response.ok(emp).build();
	}

	// Converts entity into model
	public EmployeeModel of(Employee source) {
		EmployeeModel empModel = null;
		if (source != null) {
			empModel = new EmployeeModel();
			empModel.setEmpId(source.getEmpId());
			empModel.setEmpName(source.getEmpName());
			empModel.setContact(source.getContact());
		}
		return empModel;

	}

	// Converts model into entity
	public Employee of(EmployeeModel source) {
		Employee emp = null;
		if (source != null) {
			emp = new Employee();
			emp.setEmpId(source.getEmpId());
			emp.setContact(source.getContact());
			emp.setEmpName(source.getEmpName());
		}
		return emp;

	}

	//To Retrieve all the Employees list
	@Override
	public List<EmployeeModel> getAllEmps() {
		System.out.println("I am called");
		return empRepo.findAll().stream().map(f -> of(f)).collect(Collectors.toList());
	}

}
