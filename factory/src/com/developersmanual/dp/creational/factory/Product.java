package com.developersmanual.dp.creational.factory;

import java.io.Serializable;

public abstract class Product implements Serializable {

	private String name;

	public Product(String name) {
		this.name = name;
	}
	public abstract String getProductName();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
