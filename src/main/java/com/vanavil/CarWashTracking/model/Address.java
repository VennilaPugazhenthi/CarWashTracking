package com.vanavil.CarWashTracking.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String add_line1;
    private String add_line2;
    private String city;
    private String state;
    private String zip_code;
}

