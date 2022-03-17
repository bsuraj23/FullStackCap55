package Polymorphism;

class Bank{
float getRateOfInterest(){return 7;}  
}
class SBI extends Bank{
float getRateOfInterest(){return 8.4f;}  
}
class AXIS extends Bank{
float getRateOfInterest(){return 9.7f;}  
}  

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b;  
		b=new SBI();  
		System.out.println("SBI ROI: "+b.getRateOfInterest());
		b=new AXIS();  
		System.out.println("AXIS ROI: "+b.getRateOfInterest()); 
		
	}

}
