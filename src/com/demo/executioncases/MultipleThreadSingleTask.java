package com.demo.executioncases;

class Multiple extends Thread {

	@Override
	public void run() {

		for(int i=0 ; i<=5 ; i++) {

			System.out.println(i + "--" + Thread.currentThread().getName());
		}
	}

}

public class MultipleThreadSingleTask {

	public static void main(String[] args) {

		Multiple m1 = new Multiple();	
		m1.setName("Thread 1");
		m1.start();
		
		Multiple m2 = new Multiple();
		m2.setName("Thread 2");
		m2.start();
		
		
	}
}
