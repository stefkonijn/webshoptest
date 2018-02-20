package com.jwt.domain;

public class Order {
	private int id;
	private Adress deliveryadress;
	
	public Order(int id, Adress deliveryadress) {
		super();
		this.id = id;
		this.deliveryadress = deliveryadress;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Adress getDeliveryadress() {
		return deliveryadress;
	}
	public void setDeliveryadress(Adress deliveryadress) {
		this.deliveryadress = deliveryadress;
	}
	

}
