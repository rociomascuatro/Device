package com.calderon.device;

public class Device {
	private String name;
	protected String brand;
	protected Double price;
	
	public Device(String name, String brand, Double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [getName()=" + getName() 
		+ ", getBrand()=" + getBrand() 
		+ ", getPrice()=" + getPrice()
		+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
}
