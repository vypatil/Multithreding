package com.demo.seatbookingapp;

public class TheaterSeats {

	int total_seats=10;

	void bookseat(int seats) {

		if (total_seats>=seats) {

			System.out.println(seats + "seats booked successfully.");
			
			total_seats=total_seats-seats;
			
			System.out.println("seats left : " + total_seats);

		}
		else {
			
			System.out.println("sorry seats cannot be booked...!!");
			System.out.println("seats left : " + total_seats);
		}


	}

}
