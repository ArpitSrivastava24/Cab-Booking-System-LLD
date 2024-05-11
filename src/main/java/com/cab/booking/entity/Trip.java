package com.cab.booking.entity;

import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Trip {

    private Rider rider;

    private Driver driver;

    private String srclocation;

    private String destLocation;

    private int tripId;

    private double price;

    private PricingStrategy pricingStrategy;

    private DriverMatchingStrategy driverMatchingStrategy;

    public String toString() {
        return "Trip{" +
                "rider=" + rider +
                ", driver=" + driver +
                ", srclocation='" + srclocation + '\'' +
                ", destLocation='" + destLocation + '\'' +
                ", tripId=" + tripId +
                ", price=" + price +
                ", pricingStrategy=" + pricingStrategy +
                ", driverMatchingStrategy=" + driverMatchingStrategy +
                '}';
    }

    public void view(){
        System.out.println("Rider : " + rider.getRiderName() + " Driver: " + driver.getDriverName());
    }
}
