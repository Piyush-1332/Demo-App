package com.cg.service;

import java.util.List;

import javax.ws.rs.core.Response;

import com.cg.model.EmployeeModel;
/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee Service Interface
 * 
 *******************************************************************************************************************************/

public interface EmpService {

	List<EmployeeModel> getAllEmps();

	Response findById(int id);

}
