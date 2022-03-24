package com.march14.inheritance;

public class Apple extends Mobile{
	String brand;
	int battery;
	public Apple(String brand,int battery){
	this.brand = brand;
	this.battery = battery;
	}
	public String getBrand() {
	return brand;
	}
	public void setBrand(String brand) {
	this.brand = brand;
	}
	public int getBattery() {
	return battery;
	}
	public void setBattery(int battery) {
	this.battery = battery;
	}
}
