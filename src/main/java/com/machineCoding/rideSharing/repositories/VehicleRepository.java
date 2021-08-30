package com.machineCoding.rideSharing.repositories;

import com.machineCoding.rideSharing.filters.VehicleFilter;
import com.machineCoding.rideSharing.models.Vehicle;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface VehicleRepository {
    Vehicle addVehicle(Vehicle vehicle);
    List<Vehicle> filterVehicles(List<VehicleFilter> vehicleFilters);
    Vehicle getVehicleById(String vehicleId);
}