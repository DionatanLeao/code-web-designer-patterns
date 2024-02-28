package com.codeweb.patterns.factory.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

    private String name;
    private int numberOfDoors;
    private int fuelCapacity;
    private String type;

}


