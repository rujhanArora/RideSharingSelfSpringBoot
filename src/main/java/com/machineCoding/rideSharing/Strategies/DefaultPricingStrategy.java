package com.machineCoding.rideSharing.Strategies;

import com.machineCoding.rideSharing.models.Location;

public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public Double getPrice(Location from, Location to) {
        return from.straightDistance(to).doubleValue();
    }
}
