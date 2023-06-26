package com.demo.multithreding;

import javax.swing.SingleSelectionModel;

public class Demo1 extends Thread{

	public static void main(String[] args) {

		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		System.out.println("Hiii");
		
		Demo1 obj = new Demo1();

		obj.start();

		System.out.println("boss");
		
		Demo1 obj2 = new Demo1();
		obj2.start();
	}

	@Override
	public void run() {



		System.out.println("hello run method");
		System.out.println("hello run method");
		System.out.println("hello run method");
		System.out.println("hello run method");
		System.out.println("hello run method");

	}


}
