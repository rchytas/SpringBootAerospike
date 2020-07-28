package com.rchytas.aerospike.demo.repository;

import org.springframework.data.aerospike.repository.AerospikeRepository;
import org.springframework.stereotype.Repository;

import com.rchytas.aerospike.demo.model.Car;

@Repository
public interface CarRepository extends AerospikeRepository<Car, String> {

}
