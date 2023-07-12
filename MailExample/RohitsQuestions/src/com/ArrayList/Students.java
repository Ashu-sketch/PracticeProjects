package com.ArrayList;

import java.util.Objects;

public class Students {
	 int roll;
	 String sname;
	public Students(int roll, String sname) {
		super();
		this.roll = roll;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Students [roll=" + roll + ", sname=" + sname + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(roll);
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return roll == other.roll && Objects.equals(sname, other.sname);
	}
	 

}
