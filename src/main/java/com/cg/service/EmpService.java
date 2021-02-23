package com.cg.service;

import java.util.Collection;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cg.model.EmployeeModel;

@Path("emps")
@Produces(MediaType.APPLICATION_JSON)
public interface EmpService {

	@GET
	public Collection<EmployeeModel> getAllEmployees();

	@Path("{id}")
	@GET
	public Response getById(@PathParam("id") int id);
}
