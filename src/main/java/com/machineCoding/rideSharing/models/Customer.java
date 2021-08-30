package com.machineCoding.rideSharing.models;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
public class Customer extends BaseEntity {
    @NonNull
    private Account account;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private Date dob;
}