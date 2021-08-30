package com.machineCoding.rideSharing.repositories;
import com.machineCoding.rideSharing.filters.VehicleFilter;
import com.machineCoding.rideSharing.models.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class VehicleRepositoryInMemoryImpl implements VehicleRepository {
    private List<Vehicle> vehicles = new ArrayList<>();
    private Map<String, Integer> idToVehicleIndex = new HashMap<>();

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        Vehicle addedVehicle = new Vehicle(vehicle.getDriver(), vehicle.getVehicleNo(), vehicle.getModelDetails(),
                vehicle.getVehicleType());
        vehicles.add(addedVehicle);
        idToVehicleIndex.put(addedVehicle.getId(), vehicles.size() - 1);
        return addedVehicle;
    }

    @Override
    public List<Vehicle> filterVehicles(List<VehicleFilter> vehicleFilters) {
        return vehicles.stream().filter(vehicle -> {
            for (VehicleFilter vehicleFilter: vehicleFilters) {
                if (!vehicleFilter.apply(vehicle)) {
                    return false;
                }
            }
            return true;
        }).collect(Collectors.toList());
    }

    @Override
    public Vehicle getVehicleById(String vehicleId) {
        return vehicles.get(idToVehicleIndex.get(vehicleId));
    }
}
