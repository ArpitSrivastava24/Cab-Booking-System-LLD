package com.cab.booking.manager;

import com.cab.booking.entity.Driver;

import java.util.HashMap;

public class DriverManager {

    private static DriverManager driverManager;

    HashMap<String, Driver> map=new HashMap<>();

    private DriverManager(){

    }

    public static DriverManager getInstance(){
        if(driverManager==null){
            driverManager=new DriverManager();
        }
        return driverManager;
    }

    public void addDriver(String driverName, Driver driver){
        map.put(driverName,driver);
    }

    public  Driver getDriver(String driverName){
        return map.get(driverName);
    }
}
