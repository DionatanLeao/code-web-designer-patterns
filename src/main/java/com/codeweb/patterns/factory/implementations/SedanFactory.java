package com.codeweb.patterns.factory.implementations;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.model.Car;
import com.codeweb.patterns.factory.interfaces.CarFactory;

public class SedanFactory implements CarFactory {
    @Override
    public Car createCar() {
        var car = new Car();
        car.setName("Toyota Corolla");
        car.setNumberOfDoors(4);
        car.setFuelCapacity(50);
        car.setType(CarType.valueOf("SEDAN"));
        return car;
    }
}
