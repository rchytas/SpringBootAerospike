package com.rchytas.aerospike.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rchytas.aerospike.demo.model.Car;
import com.rchytas.aerospike.demo.service.CarService;

@RestController
@RequestMapping("/fleet/cars")
public class CarResource {

	@Autowired
	private CarService carService;

	@GetMapping
	public List<Car> getAllCars() {

		return carService.getAll();
	}

	@PostMapping
	public List<Car> create(@RequestBody final Car car) {

		carService.create(car);

		return carService.getAll();
	}
}
