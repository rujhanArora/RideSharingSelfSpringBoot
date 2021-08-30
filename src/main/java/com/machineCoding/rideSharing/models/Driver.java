package com.machineCoding.rideSharing.models;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class Driver extends BaseEntity {
    @NonNull
    private Account account;
    @NonNull
    private long phoneNumber;
    @NonNull
    private String aadharNumber;
    @NonNull
    private String name;
    @Builder.Default
    private List<Vehicle> vehicles = new ArrayList<>();
    private Vehicle currentVehicle;
    @NonNull
    private String licenseDetails;
    @NonNull
    private Date dob;

    public void addVehicle(Vehicle vehicle) {
        this.getVehicles().add(vehicle);
    }

    public Driver(Driver driver) {
        super();
        this.setAccount(driver.getAccount());
        this.setPhoneNumber(driver.getPhoneNumber());
        this.setAadharNumber(driver.getAadharNumber());
        this.setName(driver.getName());
        this.setVehicles(driver.getVehicles());
        this.setCurrentVehicle(driver.getCurrentVehicle());
        this.setLicenseDetails(driver.getLicenseDetails());
        this.setDob(driver.getDob());
    }
}