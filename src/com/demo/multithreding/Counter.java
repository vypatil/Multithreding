package com.demo.multithreding;

public class Counter {

	private static int c =0;
	
	public void increment() {
		c++;
	}
	
	public void decreament() {
		c--;
	}
	
	public int value() {
		
		return c;
	}
}
