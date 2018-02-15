package com.jwt.domain;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String name;
	private List<Product> products = new ArrayList<Product>();

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(String name, List<Product> products) {
		this.name = name;
		this.products = products;
	}

	public void addProduct(Product product) {
		this.products.add(product);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
