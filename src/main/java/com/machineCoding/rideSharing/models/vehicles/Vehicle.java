package com.machineCoding.rideSharing.models.vehicles;

import com.machineCoding.rideSharing.models.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Vehicle extends BaseEntity {
    private Driver driver;
    private String vehicleNo;
    private String modelDetails;
    private VehicleType vehicleType;
    private Trip currentTrip;
    Location currentLocation;
    VehicleStatus vehicleStatus;

    public Vehicle(Driver driver, String vehicleNo, String modelDetails, VehicleType vehicleType) {
        super();
        this.setDriver(driver);
        this.setVehicleNo(vehicleNo);
        this.setModelDetails(modelDetails);
        this.setVehicleType(vehicleType);
        this.setVehicleStatus(VehicleStatus.ONLINE);
    }

    public boolean isAvailable() {
        return this.getCurrentTrip() == null && this.getVehicleStatus().equals(VehicleStatus.ONLINE);
    }
}
