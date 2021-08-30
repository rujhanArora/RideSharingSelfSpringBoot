package com.machineCoding.rideSharing.models;

import com.machineCoding.rideSharing.utils.TokenUtil;
import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseEntity {
    private String id;
    private Date createdAt;
    private Date updatedAt;

    public BaseEntity() {
        this.id = TokenUtil.generateRandomTokenDefaultLength();
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
}