package com.cg.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;

/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee Mongo Repository
 * 
 *******************************************************************************************************************************/

@Repository
public interface EmpMongoRepo extends MongoRepository<Employee, Integer> {

}
