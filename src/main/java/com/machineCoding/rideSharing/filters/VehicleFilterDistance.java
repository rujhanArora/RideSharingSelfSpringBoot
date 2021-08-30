package com.machineCoding.rideSharing.filters;

import com.machineCoding.rideSharing.models.Location;
import com.machineCoding.rideSharing.models.vehicles.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class VehicleFilterDistance implements VehicleFilter {
    @NonNull
    private Double maxDistance;
    @NonNull
    private Location locationToCompare;

    // Can use epsilon comparison if required
    @Override
    public boolean apply(Vehicle vehicle) {
        return locationToCompare.straightDistance(vehicle.getCurrentLocation()) <= maxDistance;
    }
}
