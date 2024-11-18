package com.calderon.device;

public class Computer extends Device{
	private String processor;

	public Computer(String name, String brand, Double price, String processor) {
		super(name, brand, price);
		this.processor = processor;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [getProcessor()=" + getProcessor() 
//		+ ", getName()=" + getName() 
//		+ ", getPrice()=" + getPrice()
		+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
