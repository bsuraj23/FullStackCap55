package com.march14.inheritance;

public class Device {
	public static void main(String[] args) {
		//Mobile m = new Mobile();
		Apple a = new Apple("Apple", 4000);
		Samsung s = new Samsung("Samsung",5000);
		a.setName("iphone 12");
		a.setCost(70000);
		a.setSoftwareVersion("IOS");
		s.setBattery(3500);
		s.setName("Galaxy Pro");
		s.setCost(45000);
		s.setSoftwareVersion("Android");
		System.out.println(a.getBrand());
		System.out.println(a.getName());
		System.out.println(a.getCost());
		System.out.println(a.getSoftwareVersion());
		System.out.println(a.getBattery());
		System.out.println(s.getBrand());
		System.out.println(s.getName());
		System.out.println(s.getCost());
		System.out.println(s.getSoftwareVersion());
		System.out.println(s.getBattery());
		}
}
