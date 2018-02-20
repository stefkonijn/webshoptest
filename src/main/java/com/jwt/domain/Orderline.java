package com.jwt.domain;

public class Orderline {
	private int id;
	private int amount;
	private double price;
	
	public Orderline(int id, int amount, double price) {
		super();
		this.id = id;
		this.amount = amount;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
