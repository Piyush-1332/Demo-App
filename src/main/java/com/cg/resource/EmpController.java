package com.cg.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.model.EmployeeModel;
import com.cg.service.EmpService;
/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee Resource using Jax-rs
 * 
 *******************************************************************************************************************************/

@Path("emp")
@Produces(MediaType.APPLICATION_JSON)
public class EmpController {

	@Autowired
	private EmpService empService;
	
	//could have used Response Entity
	@GET
	public List<EmployeeModel> getRooms() {
		return empService.getAllEmps();
	}
	
	@Path("{id}")
	@GET
	public Response getById(@PathParam("id") int id) {
		return empService.findById(id);
	}

}
