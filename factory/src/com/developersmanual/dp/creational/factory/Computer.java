package com.developersmanual.dp.creational.factory;

public class Computer extends Product {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Computer(String name) {
		super(name);
	}

	@Override
	public String getProductName() {
		return getName();
	}

}
