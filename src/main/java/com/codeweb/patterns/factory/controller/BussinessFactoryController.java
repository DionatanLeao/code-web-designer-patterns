package com.codeweb.patterns.factory.controller;

import com.codeweb.patterns.factory.model.Car;
import com.codeweb.patterns.factory.service.BussinessService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/factory")
public class BussinessFactoryController {
    private BussinessService service;

    private BussinessFactoryController(BussinessService service) {
        this.service = service;
    }

    @PostMapping("/create-car/{type}")
    public ResponseEntity<Car> createCar(@PathVariable("type") String type) throws ClassNotFoundException {
        return new ResponseEntity<Car>(this.service.createCar(type), HttpStatus.CREATED);
    }
}
