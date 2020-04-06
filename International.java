package com.avi;

import java.io.*;

public class International implements Flights {

	@Override
	public void flightName() {

		System.out.println("Emirate");
		// TODO Auto-generated method stub

	}

	@Override
	public void flightDeparture() {
		System.out.println("Abu Dhabi");
		// TODO Auto-generated method stub

	}

	@Override
	public void flightGetPassengerStatusNames() throws IOException {

		int a, b, c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Value of a");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter the Value of b");
		b = Integer.parseInt(br.readLine());
		c = a + b;

		String Name = "AVIRAJ";
		System.out.println();
		System.out.println("Passenger" + (c) + (Name));
		int x = 1;
		int y = 1;
		int z = x + y;
		String Name1 = "ANUP";
		String Name2 = "SUBARNA";
		System.out.println();
		String Name13 = "ANUP + SUBARNA";

		System.out.println("Passenger" + (z) + (Name13));

		int x1 = 1;
		int y1 = 2;
		int z1 = x1 + y1;
		String Name3 = "A+B+C";
		System.out.println();
		System.out.println("Passenger" + z1 + Name2);
		// TODO Auto-generated method stub

	

	//private int utStreamReader(InputStream in) {
		// TODO Auto-generated method stub
		//return 0;
	}

}
