package com.cab.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class TripMetaData {

    int riderRating;

    @Setter
    int driverRating;

    String srcLoc;
    String destLoc;

}
