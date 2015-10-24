package com.developersmanual.dp.creational;

//for a kingdom only one King exists(Logical Resoning)


/**
 * @author admin
 *This is a simple singleton instance. THis will give the same object even if you are tried for many times.
 *In case of MulitThreaded environment we have some issues related to singleton. check other implementaions for solutions.
 */
public class King {

	private static King king;
	
	private King() {
	}
	
	public static King getInstance() {
		if(king == null)
			king = new King();
		
		return king;
	}
}
