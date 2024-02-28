package com.codeweb.patterns.factory.implementations;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.model.Car;
import com.codeweb.patterns.factory.interfaces.CarFactory;

public class HatchFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setName("Peugeot 208");
        car.setNumberOfDoors(2);
        car.setFuelCapacity(47);
        car.setType(CarType.valueOf("HATCH"));
        return car;
    }
}
