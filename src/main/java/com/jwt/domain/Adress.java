package com.jwt.domain;

public class Adress {
	private int id;
	private String street;
	private int streetnumber;
	public Adress(String street, int streetnumber) {
		this.street = street;
		this.streetnumber = streetnumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getStreetnumber() {
		return streetnumber;
	}
	public void setStreetnumber(int streetnumber) {
		this.streetnumber = streetnumber;
	}

}
