package com.cab.booking;

import com.cab.booking.entity.Rider;
import com.cab.booking.entity.Trip;
import com.cab.booking.manager.TripManager;

public class CabBookingSystemApplication {

	public static void main(String[] args) {
		Rider rider=new Rider("Abhishek",5);
		String src="E-City";
		String dest="G-City";

		Trip trip=TripManager.createTrip(rider,src,dest);
		trip.toString();
		System.out.println(trip);
//		System.out.println(trip.getDriver().getDriverName());
	}

}
