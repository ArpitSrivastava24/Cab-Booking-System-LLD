package com.cab.booking.manager;

import com.cab.booking.entity.Rider;

import java.util.HashMap;

public class RiderManager {

    private static RiderManager riderManager;

    HashMap<String, Rider> map;

    private RiderManager(){

    }

//    public static RiderManager getInstance(){
//        if(riderManager==null){
//            riderManager=new RiderManager();
//        }
//        return riderManager;
//    }

    public void addRider(String riderName, Rider rider){
        map.put(riderName, rider);
    }

    public  Rider getRider(String RiderName){
        return map.get(RiderName);
    }
}
