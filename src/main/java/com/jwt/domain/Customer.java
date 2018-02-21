package com.jwt.domain;

public class Customer {
	private String name;
	private String lastname;
	private Adress adress;

	public Customer(String name, String lastname, Adress adress){
		this.name = name;
		this.lastname = lastname;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}
