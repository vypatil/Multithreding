package com.demo.multithreding;

class T1 extends Thread{

	public synchronized void m1 () throws InterruptedException {

		for(int i=0 ; i<=10 ; i++) {

			System.out.println(i);
		}
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
		try {
			m1();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class T2 extends Thread{

	public synchronized void m2 () {
		
		for(int i=11 ; i<=20 ; i++) {

			System.out.println(i);
		}
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m2();
	}
}
public class TestMultipleThread {

	public static void main(String[] args) {

		T1 obj1 = new T1();
		T2 obj2 = new T2();

		obj1.start();
		obj2.start();

	}
}
