package com.model;

public class Employee {
	private int empId;
	private String EmployeeName;
	private String EmplooyeeEmail;
	private String emppass;

	public Employee(String employeeName, String emplooyeeEmail, String emppass) {
		super();
		EmployeeName = employeeName;
		EmplooyeeEmail = emplooyeeEmail;
		this.emppass = emppass;
	}

	public Employee(int empId, String employeeName, String emplooyeeEmail, String emppass) {
		super();
		this.empId = empId;
		EmployeeName = employeeName;
		EmplooyeeEmail = emplooyeeEmail;
		this.emppass = emppass;
	}

	public int getEmpId() {
		return empId;
	}

	public Employee(String emplooyeeEmail, String emppass) {
		super();
		EmplooyeeEmail = emplooyeeEmail;
		this.emppass = emppass;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmplooyeeEmail() {
		return EmplooyeeEmail;
	}

	public void setEmplooyeeEmail(String emplooyeeEmail) {
		EmplooyeeEmail = emplooyeeEmail;
	}

	public String getEmppass() {
		return emppass;
	}

	public void setEmppass(String emppass) {
		this.emppass = emppass;
	}

}
