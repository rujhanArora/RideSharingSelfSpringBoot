package com.machineCoding.rideSharing.models;

import com.machineCoding.rideSharing.models.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle extends BaseEntity {
    private Driver driver;
    private String vehicleNo;
    private String modelDetails;
    private VehicleType vehicleType;
    private Trip currentTrip;
    private Location currentLocation;
    private VehicleStatus vehicleStatus;
    private List<Trip> pastTrips = new ArrayList<>();

    public Vehicle(Driver driver, String vehicleNo, String modelDetails, VehicleType vehicleType) {
        super();
        this.setDriver(driver);
        this.setVehicleNo(vehicleNo);
        this.setModelDetails(modelDetails);
        this.setVehicleType(vehicleType);
        this.setVehicleStatus(VehicleStatus.ONLINE);
    }

    public boolean isAvailable() {
        return this.getVehicleStatus().equals(VehicleStatus.ONLINE);
    }

    public void assignTrip(Trip trip) {
        this.setCurrentTrip(trip);
        this.setVehicleStatus(VehicleStatus.IN_A_TRIP);
    }

    public void completeTrip() {
        this.getPastTrips().add(currentTrip);
        this.setCurrentTrip(null);
        this.setVehicleStatus(VehicleStatus.ONLINE);
    }
}
