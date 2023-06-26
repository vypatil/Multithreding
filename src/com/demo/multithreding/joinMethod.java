package com.demo.multithreding;

class Child extends Thread {
	
	public void run() {

		for(int i=0 ; i<=5 ; i++) {

			System.out.println("child thread" + i);
				
			try {
				Thread.sleep(1000);
				
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class joinMethod {
	
	public static void main(String[] args) {

		Child c1 = new Child();
		
		c1.start();		
		
		try {
			c1.join(); 	// stop main thread execution when child execution not completed
		} 
		catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		for(int i=0 ; i<=10 ; i++) {

			System.out.println("main thread" + i);

			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
