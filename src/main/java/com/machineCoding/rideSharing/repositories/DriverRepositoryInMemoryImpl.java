
package com.machineCoding.rideSharing.repositories;

import com.machineCoding.rideSharing.models.Driver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DriverRepositoryInMemoryImpl implements DriverRepository {
    private List<Driver> drivers = new ArrayList<>();
    private Map<String, Integer> idToDriverIndex = new HashMap<>();

    @Override
    public Driver addDriver(Driver driver) {
        Driver addedDriver = new Driver(driver);
        drivers.add(addedDriver);
        idToDriverIndex.put(addedDriver.getId(), drivers.size() - 1);
        return addedDriver;
    }

    @Override
    public Driver getDriverById(String driverId) {
        return drivers.get(idToDriverIndex.get(driverId));
    }
}
