package com.cab.booking.strategy;

import com.cab.booking.entity.Driver;
import com.cab.booking.entity.TripMetaData;

public interface DriverMatchingStrategy {

    Driver matchDriver(TripMetaData tripMetaData);

}
