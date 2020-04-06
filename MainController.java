package com.avi7;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avi.Flights;
import com.avi1.Hotels;
import com.avi2.VilasAppartment;
import com.avi3.Train;
import com.avi4.Bus;
import com.avi5.Cabs;
import com.avi6.Visa;

public class MainController {

	public static void main(String args[]) throws IOException {

		// Flights

		ApplicationContext AC = new ClassPathXmlApplicationContext("Bean.xml");
		Flights flights = (Flights) AC.getBean("Flights", Flights.class);
		flights.flightName();
		flights.flightDeparture();
		flights.flightGetPassengerStatusNames();

		// Hotels

		ApplicationContext AC1 = new ClassPathXmlApplicationContext("Bean.xml");
		Hotels hotels = (Hotels) AC1.getBean("Hotels", Hotels.class);
		hotels.getHotelName();
		hotels.HotelDestination();
		hotels.getHotelCost();

		// VilasAppartment

		ApplicationContext AC2 = new ClassPathXmlApplicationContext("Bean.xml");
		VilasAppartment vilasappartment = (VilasAppartment) AC2.getBean("VilasAppartment", VilasAppartment.class);
		vilasappartment.VillaAppartmentNames();
		vilasappartment.VillaAppartmentDestination();
		vilasappartment.VillaAppartmentCost();

		// Train

		ApplicationContext AC3 = new ClassPathXmlApplicationContext("Bean.xml");
		Train train = (Train) AC3.getBean("Train", Train.class);
		train.TrainName();
		train.TrainDestination();
		train.TrainFare();

		// Bus

		ApplicationContext AC4 = new ClassPathXmlApplicationContext("Bean.xml");
		Bus bus = (Bus) AC4.getBean("Bus", Bus.class);
		bus.BusName();
		bus.BusDestination();
		bus.BusFare();

		// Cabs

		ApplicationContext AC5 = new ClassPathXmlApplicationContext("Bean.xml");
		Cabs cabs = (Cabs) AC5.getBean("Cabs", Cabs.class);
		cabs.CabDestination();
		cabs.cabFare();

		// Visa

		ApplicationContext AC6 = new ClassPathXmlApplicationContext("Bean.xml");
		Visa visa = (Visa) AC6.getBean("Visa", Visa.class);
		visa.VisaNumber();
		visa.VisaType();
		visa.VisaExpirationDate();
		visa.VisaDestination();
		visa.VisaCost();

	}

}
