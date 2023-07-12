package com.SpringCore.SpringCore.Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Empolyee {
int empId;
String empname;
List<String>phone ;
Set<String>Adddresses;
Map<String,String>courses;

public Empolyee() {
	super();
	// TODO Auto-generated constructor stub
}
public Empolyee(int empId, String empname, List<String> phone, Set<String> adddresses, Map<String, String> courses) {
	super();
	this.empId = empId;
	this.empname = empname;
	this.phone = phone;
	Adddresses = adddresses;
	this.courses = courses;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + ", phone=" + phone + ", Adddresses=" + Adddresses
			+ ", courses=" + courses + "]";
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public List<String> getPhone() {
	return phone;
}
public void setPhone(List<String> phone) {
	this.phone = phone;
}
public Set<String> getAdddresses() {
	return Adddresses;
}
public void setAdddresses(Set<String> adddresses) {
	Adddresses = adddresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}


}
