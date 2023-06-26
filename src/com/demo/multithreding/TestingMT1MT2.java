package com.demo.multithreding;

public class TestingMT1MT2 {
	
	public static void main(String[] args) {
		
		Counter obj = new Counter();
		
		MT1andMT2 m1 = new MT1andMT2(obj);
		
		MT2 m2 = new MT2(obj);
		
		m1.start();
		m2.start();
	}

}
