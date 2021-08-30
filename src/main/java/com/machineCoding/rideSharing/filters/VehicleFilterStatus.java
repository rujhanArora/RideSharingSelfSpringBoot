package com.machineCoding.rideSharing.filters;

import com.machineCoding.rideSharing.models.VehicleStatus;
import com.machineCoding.rideSharing.models.vehicles.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class VehicleFilterStatus implements VehicleFilter {
    private List<VehicleStatus> validStatuses;

    @Override
    public boolean apply(Vehicle vehicle) {
        return validStatuses.contains(vehicle.getVehicleStatus());
    }
}
