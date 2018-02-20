package com.jwt.domain;

public class Product {
	private String name;
	private Category category;
	private double price;
	private int id;
	public Product(){
		
	}
	public Product(String name, Category category, double price, int id){
		this.name = name;
		this.category = category;
		this.price = price;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
