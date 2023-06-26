package com.demo.seatbookingapp;

public class BookingProcess extends Thread {

	 static TheaterSeats t;
	 int seats;
	
	@Override
	public void run() {
		
		t.bookseat(seats);
		
	}
	
	public static void main(String[] args) {
		
		t=new TheaterSeats();
		
		BookingProcess vaibhav = new BookingProcess();
		vaibhav.seats=7;
		vaibhav.start();
		
		BookingProcess sush = new BookingProcess();
		sush.seats=6;
		sush.start();
		
	}
}
