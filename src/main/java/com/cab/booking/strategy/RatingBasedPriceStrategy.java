package com.cab.booking.strategy;

import com.cab.booking.entity.TripMetaData;

public class RatingBasedPriceStrategy implements PricingStrategy {

    TripMetaData tripMetaData;
    @Override
    public double calculatePrice(TripMetaData tripMetaData){
        return tripMetaData.getRiderRating()>3?50:100;
    }

}
