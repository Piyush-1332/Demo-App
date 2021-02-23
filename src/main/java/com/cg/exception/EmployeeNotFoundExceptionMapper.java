package com.cg.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Value;
/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee Exception Mapper
 * 
 *******************************************************************************************************************************/

@Provider
public class EmployeeNotFoundExceptionMapper implements ExceptionMapper<EmployeeNotFoundException> {

	@Value("${message.studentNotfound}")
	String message;

	@Override
	public Response toResponse(EmployeeNotFoundException exception) {
		return Response.serverError().entity(message).type(MediaType.APPLICATION_JSON).build();
	}

}
