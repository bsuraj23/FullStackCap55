package com.capg49lsr.day1;

public class SystemConfig {

	    public static void main(String[] args) {
		// write your code here
	        String nameOS="os.name";
	        String versionsOS="os.version";
	        String architecture="os.arch";
	        System.out.println(System.getProperty(nameOS));
	        System.out.println(System.getProperty(versionsOS));
	        System.out.println(System.getProperty(architecture));
	    }
	
}
