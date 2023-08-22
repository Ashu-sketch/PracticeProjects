package com.registerfrom.index.signin;

public class RegisterDao {
	public RegisterDao(int days, int months, int years) {
		super();
		this.days = days;
		this.months = months;
		this.years = years;
	}
	private String fname;
	private String lname;
	private String age;
	private String psw;
	private String email;
	
	//calculate age
	private int days;
	   private int months;
	   private int years; 
	
	public RegisterDao(String fname, String lname, String age, String psw, String email) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.psw = psw;
		this.email = email;
	}
	public RegisterDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}

}
