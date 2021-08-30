package com.machineCoding.rideSharing.models.vehicles;

import com.machineCoding.rideSharing.models.Location;
import com.machineCoding.rideSharing.models.VehicleStatus;
import com.machineCoding.rideSharing.models.VehicleType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Car extends Vehicle {

    public Car(String driverId, String vehicleNo, String modelDetails) {
        super(driverId, vehicleNo, modelDetails, VehicleType.CAR);
    }
}
