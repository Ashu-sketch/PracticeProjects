package com.Employee;

public class Employee {
private int eid;
private String eName;
private float eSalary;
public Employee(int eid, String eName, float eSalary) {
	super();
	this.eid = eid;
	this.eName = eName;
	this.eSalary = eSalary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public float geteSalary() {
	return eSalary;
}
public void seteSalary(float eSalary) {
	this.eSalary = eSalary;
}
@Override
public String toString() {
	return this.eid+ this.eName+ this.eSalary;
}
}
