package com.machineCoding.rideSharing.models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private Double latitude;
    private Double longitude;
    public Double straightDistance(Location location2) {
        return Math.sqrt(
                Math.pow(this.getLatitude() - location2.getLatitude(), 2) +
                        Math.pow(this.getLongitude() - location2.getLongitude(), 2)
        );
    }
}
