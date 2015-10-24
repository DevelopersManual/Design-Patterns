package com.developersmanual.dp.creational.singleton;


/**
 * @author admin
 *Bill Pugh is one of well known researcher. He found a approach to avoid multi-threading issue.
 *He name this approach to his name only. this is simple to implement.
 *
 *This implementaion avoids the resouce leaking issue as well as multi-threading issue.
 */
public class MultiThreadedKing {

	private MultiThreadedKing() {
		// TODO Auto-generated constructor stub
	}
	
	private static class KingHelper {
		private static final MultiThreadedKing KING_INSTANCE = new MultiThreadedKing();
	}
	
	public static MultiThreadedKing getInstance(){
		return KingHelper.KING_INSTANCE;
	}
}
