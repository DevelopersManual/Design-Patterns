package com.developersmanual.dp.creational.singleton;

//for a kingdom only one King will exist(logical reasoning).
public class KingdomSingletonClient {

	public static void main(String[] args) {
		/*King king = King.getInstance();
		System.out.println(king);
		King king1 = King.getInstance();
		System.out.println(king == king1);*/
		
		EagerKing king = EagerKing.getInstance();
		EagerKing king1 = EagerKing.getInstance();
		
		System.out.println(king == king1);
		
		
	}
}
