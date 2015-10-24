package com.developersmanual.dp.creational.factory;

public class Laptop extends Product{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1311497996411333913L;

	
	public Laptop(String name) {
		super(name);
	}
	@Override
	public String getProductName() {
		return getName();
	}

}
