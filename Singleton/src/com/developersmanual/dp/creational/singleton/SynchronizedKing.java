package com.developersmanual.dp.creational.singleton;

/**
 * @author admin Normal singleton instances, will not work in the the
 *         multithreaded environment. current implementation will give
 *         multithread safe implmenation.
 *         
 *         1) synchronized method
 *         2) synchronized block
 *         3) double-locking check
 */
public class SynchronizedKing {

	private static SynchronizedKing king = null;

	private SynchronizedKing() {

	}

	// method1
	public static synchronized SynchronizedKing getSynchronizedMethodInstance() {
		if (king == null)
			king = new SynchronizedKing();

		return king;
	}

	// method2
	public static SynchronizedKing getSynchronizedBlockInstance() {
		synchronized (king) {
			if (king == null)
				king = new SynchronizedKing();
		}

		return king;
	}
	
	// double-lock checking
	public static SynchronizedKing getInstance() {
		if(king == null)
			synchronized (SynchronizedKing.class) {
				if (king == null)
					king = new SynchronizedKing();
			}

		return king;
	}
	
}
