package com.machineCoding.rideSharing.models;

import com.machineCoding.rideSharing.models.vehicles.Vehicle;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Driver extends BaseEntity {
    @NonNull
    private Account account;
    @NonNull
    private long phoneNumber;
    @NonNull
    private String aadharNumber;
    @NonNull
    private String name;
    private List<Vehicle> vehicle = new ArrayList<>();
    private Vehicle currentVehicle;
    @NonNull
    private String licenseDetails;
    @NonNull
    private Date dob;

    public void addVehicle(Vehicle vehicle) {
        this.getVehicle().add(vehicle);
    }
}