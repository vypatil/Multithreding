package com.demo.multithreding;

 class MT1andMT2 extends Thread {
	
	Counter co;
	
	public MT1andMT2(Counter co) {
		super();
		this.co = co;
	}
	
	public void run() {
		
		System.out.println("MT1 running operation");
		
		System.out.println(Thread.currentThread().getName());
		
		co.increment();
		
		System.out.println("After increment c = " + co.value());
	}
}
 class MT2 extends Thread {
	 
	 Counter co;
	 
	public MT2(Counter co) {
		super();
		this.co = co;
	}
	
	public void run() {
		
		System.out.println("MT2 running operation");
		
		System.out.println(Thread.currentThread().getName());
		
		co.decreament();
		
		System.out.println("After decrement c = " + co.value());
		
	}
	 
	 
 }
 
