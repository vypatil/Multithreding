package com.demo.executioncases;

class A extends Thread {

	@Override
	public void run() {

		for(int i=0 ; i<=5 ; i++) {
			System.out.println(i +" --> "+ Thread.currentThread().getName());
		}
	}
}
class B extends Thread{

	@Override
	public void run() {
		for(int i=6 ; i<=10 ; i++) {
			System.out.println(i + " --> " + Thread.currentThread().getName());
		}
	}
}
public class MultipleTaskAndMultipleThreads {

	public static void main(String[] args) {

			A a =  new A();
			a.setName("Thread A");
			a.start();
			
			B b = new B();
			b.setName("Thread B");
			b.start();
	}
}
