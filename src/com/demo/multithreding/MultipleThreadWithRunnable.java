package com.demo.multithreding;

class A implements Runnable {

	public synchronized void m1() {

		for(int i=0 ; i<=10 ;i++) {

			System.out.println(i);
		}
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m1();
	}
}

class B implements Runnable {

	public synchronized void m2 () {

		for (int i=11 ; i<=20 ; i++) {
			System.out.println(i);
		}
	}
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m2();
	}
}
public class MultipleThreadWithRunnable {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		Thread th1 = new Thread(a);
		Thread th2 = new Thread(b);

		th1.start();
		th2.start();

	}
}
