package com.cab.booking.strategy;

import com.cab.booking.entity.Driver;
import com.cab.booking.entity.TripMetaData;
import com.cab.booking.manager.DriverManager;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy {

    @Override
    public Driver matchDriver(TripMetaData tripMetaData ){
        DriverManager driverManager = null;
       return driverManager.getInstance().getDriver("shambhu");
    }
}
