package com.SpringCore.ConstructorInjection;

public class Person {
	private int UIDnum;
	private String name;
	private String address;
	@Override
	public String toString() {
		return this.UIDnum+ ""+ this.name+""+this.address;
	}
	public Person(int uIDnum, String name, String address) {
		super();
		this.UIDnum = uIDnum;
		this.name = name;
		this.address = address;
	}

}
