package com.machineCoding.rideSharing.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LocationAddress {
    private String streetLine1;
    private String streetLine2;
    private String city;
    Location location;
}
