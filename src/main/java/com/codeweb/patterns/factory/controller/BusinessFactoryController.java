package com.codeweb.patterns.factory.controller;

import com.codeweb.patterns.factory.enums.CarType;
import com.codeweb.patterns.factory.model.Car;
import com.codeweb.patterns.factory.service.BussinessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factory")
public class BusinessFactoryController {
    private BussinessService service;

    private BusinessFactoryController(BussinessService service) {
        this.service = service;
    }

    @PostMapping("/create-car/{type}")
    public ResponseEntity<Car> createCar(@PathVariable("type") String type) {
        return new ResponseEntity<Car>(this.service.createCar(CarType.valueOf(type)), HttpStatus.CREATED);
    }
}
