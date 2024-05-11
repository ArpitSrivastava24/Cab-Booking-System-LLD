package com.cab.booking.strategy;

import com.cab.booking.entity.TripMetaData;

public interface PricingStrategy {

    double calculatePrice(TripMetaData tripMetaData);

}
