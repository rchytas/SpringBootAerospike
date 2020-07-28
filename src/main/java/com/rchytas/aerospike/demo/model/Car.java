package com.rchytas.aerospike.demo.model;

import org.springframework.data.annotation.Id;

public class Car {

	@Id
	private String vin;
	private String brand;
	private String model;
	private Long battery;
	private int zipCode;
	private String coordinates;
	
	
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getBattery() {
		return battery;
	}
	public void setBattery(Long battery) {
		this.battery = battery;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}
	
	
}
