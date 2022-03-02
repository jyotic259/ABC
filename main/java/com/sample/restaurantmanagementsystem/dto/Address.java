package com.sample.restaurantmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class Address {
    private String addressLine;
    private String details;

    public Address(String addressLine, String details) {
        this.addressLine = addressLine;
        this.details = details;
    }

    public Address() {

    }
}
