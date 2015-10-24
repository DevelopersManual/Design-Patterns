package com.developersmanual.dp.creational.factory;

public class Client {

	public static void main(String[] args) {

		Product product = ProductFactory.createProduct(ProductType.TELEVISION);
		System.out.println(product.getProductName());
		product = ProductFactory.createProduct(ProductType.COMPUTER);
		System.out.println(product.getProductName());
		product = ProductFactory.createProduct(ProductType.LAPTOP);
		System.out.println(product.getProductName());
		
		
	}
}
