package com.cg.model;
/*******************************************************************************************************************************
 * -Author					 : Piyush Srivastava 
 * -Created/Modified Date 	 : 24-02-2021
 * -Description 			 : Employee data Transfer Object
 * 
 *******************************************************************************************************************************/

public class EmployeeModel {

	private int id;
	private String empName;
	private String contact;

	public int getEmpId() {
		return id;
	}

	public void setEmpId(int empId) {
		this.id = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public EmployeeModel() {

	}

	public EmployeeModel(int empId, String empName, String contact) {
		this.id = empId;
		this.empName = empName;
		this.contact = contact;
	}
}
