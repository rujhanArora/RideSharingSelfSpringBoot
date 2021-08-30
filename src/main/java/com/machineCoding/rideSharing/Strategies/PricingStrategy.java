package com.machineCoding.rideSharing.Strategies;

import com.machineCoding.rideSharing.models.Location;

public interface PricingStrategy {
    Double getPrice(Location from, Location to);
}
