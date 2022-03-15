package OOPS;

class Doctor {
	 void Doctor_Details() {
	  System.out.println("Doctor Details are :-");
	  System.out.println("Dr Rajan");
	  System.out.println("Dr Sasi");
	 }
	}

	class Surgeon extends Doctor {
	 void Surgeon_Details() {
	  System.out.println("Surgen Details are :-");
	  System.out.println("Dr Gopi");
	  System.out.println("Dr Soman");
	 }
	}

	public class HospitalInheritance {
	 public static void main(String args[]) {
	  Surgeon s = new Surgeon();
	  s.Doctor_Details();
	  s.Surgeon_Details();
	 }
	}

