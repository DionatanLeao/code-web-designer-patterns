package com.codeweb.patterns.factory.service;

import com.codeweb.patterns.factory.model.Car;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BussinessService {

    public Car createCar(String type) throws ClassNotFoundException {

        if (Objects.equals(type, "SUV")) {
            var car = new Car();
            car.setName("Jeep Compass");
            car.setNumberOfDoors(4);
            car.setFuelCapacity(60);
            car.setType("SUV");
            return car;
        } else if (Objects.equals(type, "SEDAN")) {
            var car = new Car();
            car.setName("Toyta Corolla");
            car.setNumberOfDoors(4);
            car.setFuelCapacity(50);
            car.setType("SEDAN");
            return car;
        } else if (Objects.equals(type, "HATCH")) {
            var car = new Car();
            car.setName("Peugeot 208");
            car.setNumberOfDoors(2);
            car.setFuelCapacity(47);
            car.setType("HATCH");
            return car;
        } else {
            throw new ClassNotFoundException("Type not configured.");
        }
    }
}
