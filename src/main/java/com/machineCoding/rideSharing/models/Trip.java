package com.machineCoding.rideSharing.models;

import com.machineCoding.rideSharing.utils.TokenUtil;
import com.machineCoding.rideSharing.utils.ValidationUtil;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.List;

@Data
public class Trip extends BaseEntity {
    private Customer customer;
    private Driver driver;
    private Vehicle vehicle;
    private TripStatus tripStatus;
    private Double price;
    private LocationAddress fromAddress;
    private LocationAddress toAddress;
    private String otp;
    private List<Location> routeTaken;
    private Long estimatedTimeInMinutes;
    private Date startedAt;
    private Date endedAt;


    public Trip(@NonNull Customer customer, @NonNull LocationAddress fromAddress, @NonNull LocationAddress toAddress, Long estimatedTimeInMinutes) {
        this.setCustomer(customer);
        this.setFromAddress(fromAddress);
        this.setToAddress(toAddress);
        this.setEstimatedTimeInMinutes(estimatedTimeInMinutes);
        this.setTripStatus(TripStatus.CREATED);
    }

    public void startTrip(String otp) {
        ValidationUtil.ensureTrue(this.getOtp().equals(otp), "Invalid OTP exception!");
        this.setTripStatus(TripStatus.IN_PROGRESS);
        this.setStartedAt(new Date());
    }
    public void endTrip(Double price) {
        this.setTripStatus(TripStatus.FINISHED);
        this.setEndedAt(new Date());
        this.setPrice(price);
    }

    public void assignDriver(@NonNull Driver driver, @NonNull Vehicle vehicle) {
        this.setDriver(driver);
        this.setVehicle(vehicle);
        this.setOtp(TokenUtil.generateRandomTokenDefaultLength());
        this.setTripStatus(TripStatus.DRIVER_ASSIGNED);
    }
}
