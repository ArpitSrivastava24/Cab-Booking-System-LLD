package com.cab.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Driver {
    private String driverName;
    @Setter
    private boolean available;
    private int rating;
}
