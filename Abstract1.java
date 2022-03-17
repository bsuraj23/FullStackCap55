package com.capg.Abstraction;

class Company extends Abstract1{

	@Override
	public void onboard() {
		// TODO Auto-generated method stub
		System.out.println("The Company onBoarding process Information...");
		
	}
}

public abstract class Abstract1 {
	
	public void trainings() {
		System.out.println("Training from Capgemini Company");
	}
	
	public abstract void onboard();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstract1 c=new Abstract1();  abstract class cannot create instance of object
				
				Company c=new Company();
				//I m accessing the Methods From the Abstract class 
				c.trainings();
				c.onboard();

	}

}

//Enock Harris Suahs F

