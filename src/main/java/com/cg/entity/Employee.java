package com.cg.entity;

//@Document(collection="emp")
public class Employee {
//	@Id
	private int empId;
	private String empName;
	private int contact;

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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int contact) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.contact = contact;
	}

}
