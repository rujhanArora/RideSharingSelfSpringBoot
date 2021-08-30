package com.machineCoding.rideSharing.repositories;

import com.machineCoding.rideSharing.models.Driver;
import org.springframework.stereotype.Component;

@Component
public interface DriverRepository {
    Driver addDriver(Driver driver);
    Driver getDriverById(String driverId);
}
