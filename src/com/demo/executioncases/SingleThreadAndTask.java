package com.demo.executioncases;
	
	// performing single task on single thread.

	class Single extends Thread {
		
		@Override
		public void run() {
			
			for(int i=0 ; i<=5 ; i++) {
				
				System.out.println(i);
			}
		}
	}

public class SingleThreadAndTask {
	
	public static void main(String[] args) {
		
		Single s1 = new Single();
		s1.start();
		
	}
}
