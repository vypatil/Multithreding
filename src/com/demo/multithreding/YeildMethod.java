package com.demo.multithreding;

class Sample extends Thread {

	@Override
	public void run() {
		
		Thread.yield();
		
		for(int i= 0 ; i<=10 ; i++) {

			System.out.println(i + " --> " + Thread.currentThread().getName());
		}
	}
}

public class YeildMethod {
	
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		
		s1.start();
		
		
		for(int i=0 ; i<=5 ; i++) {
			System.out.println(i +" --> " + Thread.currentThread().getName());
		}
	}
}
