package com.machineCoding.rideSharing.filters;

import com.machineCoding.rideSharing.models.Vehicle;
import org.springframework.stereotype.Component;

@Component
public interface VehicleFilter {
    public boolean apply(Vehicle vehicle);
}
