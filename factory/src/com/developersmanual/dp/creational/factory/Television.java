package com.developersmanual.dp.creational.factory;

public class Television extends Product {


	/**
	 * 
	 */
	private static final long serialVersionUID = -4580543273826789725L;

	public Television(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getProductName() {
		return getName();
	}

}
