package com.jwt.domain;

public class Customer {
	private String name;
	private String picture;
	private Adress adress;

	public Customer(String name, String picture, Adress adress){
		this.name = name;
		this.picture = picture;
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
}
