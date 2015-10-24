package com.developersmanual.dp.creational.factory;

public class ProductFactory {

	public static Product createProduct(ProductType type) {
		switch (type) {

		case TELEVISION:
			return new Television("Television");
		case LAPTOP:
			return new Laptop("Laptop");
		case COMPUTER:
			return new Computer("Computer");
		}
		return null;
	}

}
