package com.cab.booking.strategy;

import com.cab.booking.entity.TripMetaData;

public class DefaultPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(TripMetaData tripMetaData) {
        return 100.00;
    }
}
