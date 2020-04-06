package com.avi;

public class Domestic implements Flights {

	@Override
	public void flightName() {

		System.out.println("Air India");
		// TODO Auto-generated method stub

	}

	@Override
	public void flightDeparture() {

		System.out.println("New Delhi");
		// TODO Auto-generated method stub

	}

	@Override
	public void flightGetPassengerStatusNames() {
		int a = 0;
		int b = 1;
		int c = a + b;
		String Name = "A";
		System.out.println("Passenger" + c + Name);

		int x = 1;
		int y = 1;
		int z = x + y;
		String Name1 = "A+B";

		System.out.println("Passenger" + z + Name1);

		int x1 = 1;
		int y1 = 2;
		int z1 = x1 + y1;
		String Name2 = "A+B+C";
		System.out.println("Passenger" + z1 + Name2);
		// TODO Auto-generated method stub

	}

}
