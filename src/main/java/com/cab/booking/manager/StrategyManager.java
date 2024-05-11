package com.cab.booking.manager;

import com.cab.booking.entity.TripMetaData;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.LeastTimeBasedMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;
import com.cab.booking.strategy.RatingBasedPriceStrategy;

import java.util.HashMap;

public class StrategyManager {
    private  static StrategyManager strategyManager;

    private  PricingStrategy pricingStrategy;

    private StrategyManager(){

    }

    public static StrategyManager getInstance(){
        if(strategyManager==null){
            strategyManager=new StrategyManager();
        }
        return strategyManager;
    }

    public PricingStrategy determinePricingStrategy(TripMetaData tripMetaData){
        return new RatingBasedPriceStrategy();
    }

    public DriverMatchingStrategy driverMatchingStrategy(TripMetaData tripMetaData){
            return new LeastTimeBasedMatchingStrategy();
    }
}
