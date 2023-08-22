package com.ashudeveloper.registeration;
import java.util.Calendar;

public class BookingMember {
	public BookingMember(String name, String phone, String checkIn, String checkOut, String adults, String child) {
		super();
		this.name = name;
		this.phone = phone;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.adults = adults;
		this.child = child;
	}

	private String name, phone, checkIn, checkOut,adults, child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getAdults() {
		return adults;
	}

	public void setAdults(String adults) {
		this.adults = adults;
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

}
