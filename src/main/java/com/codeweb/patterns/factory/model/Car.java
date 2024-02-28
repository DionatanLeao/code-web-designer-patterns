package com.codeweb.patterns.factory.model;

import com.codeweb.patterns.factory.enums.CarType;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

    private String name;
    private int numberOfDoors;
    private int fuelCapacity;
    private CarType type;

}


