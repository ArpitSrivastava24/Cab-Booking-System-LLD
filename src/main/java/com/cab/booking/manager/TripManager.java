package com.cab.booking.manager;

import com.cab.booking.entity.Driver;
import com.cab.booking.entity.Rider;
import com.cab.booking.entity.Trip;
import com.cab.booking.entity.TripMetaData;
import com.cab.booking.strategy.DriverMatchingStrategy;
import com.cab.booking.strategy.PricingStrategy;

import java.util.HashMap;

public class TripManager {
    private static TripManager tripManager;
    private  static RiderManager riderManager;
    private static DriverManager driverManager;

    private static StrategyManager strategyManager;

    HashMap<Integer,TripMetaData> tripMetaDataInfo;
    HashMap<Integer, Trip> tripInfo;

    public TripManager(){

    }

    public static TripManager getInstance(){
        if(tripManager==null){
            tripManager=new TripManager();
        }
        return tripManager;
    }

    public static Trip createTrip(Rider rider, String src, String dest){
        Driver driver=new Driver("shambhu",true,5);
        driverManager=DriverManager.getInstance();
        driverManager.addDriver("shambhu",driver);
        TripMetaData tripMetaData=new TripMetaData(rider.getRating(),driver.getRating(),src,dest);
        strategyManager=StrategyManager.getInstance();
        DriverMatchingStrategy driverMatchingStrategy =strategyManager.driverMatchingStrategy(tripMetaData);
        Driver assignedDriver=driverMatchingStrategy.matchDriver(tripMetaData);
        PricingStrategy pricingStrategy= strategyManager.determinePricingStrategy(tripMetaData);
        double price=pricingStrategy.calculatePrice(tripMetaData);
        Trip trip=new Trip(rider,assignedDriver,src,dest,7,price,pricingStrategy,driverMatchingStrategy);
        return trip;
    }

    public HashMap<Integer, Trip> getTripsMap(){
        return tripInfo;
    }

}
