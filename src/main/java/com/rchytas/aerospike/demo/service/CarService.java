package com.rchytas.aerospike.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rchytas.aerospike.demo.model.Car;
import com.rchytas.aerospike.demo.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
    private CarRepository carRepository;

    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();
        carRepository.findAll()
                .forEach(cars::add);
        return cars;
    }

    public void create(Car car) {
        carRepository.save(car);
    }

}
