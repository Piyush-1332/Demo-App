package com.cg.model;

public class EmployeeModel {

	private int empId;
	private String empName;
	private String contact;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
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
		this.empId = empId;
		this.empName = empName;
		this.contact = contact;
	}
}
