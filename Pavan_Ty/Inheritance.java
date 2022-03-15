package com.inheritance;

class Inheritance{
	public static void main(String[] args) {
		Plane1 p1=new Plane1();
		p1.planedown();
		p1.planedown();
		p1.planeflying();
		p1.planecolor();
		p1.planetype();
	}
	
}
 class Plane {
public static void  planeup() {
	System.out.println("plane is going up");
}
public static void  planedown() {
	System.out.println("plane is going down");
}
public static void  planeflying() {
	System.out.println("plane is going flying");
}

}
 class Plane1 extends Plane {
public static void planecolor() {
	System.out.println("Blue");
}
public static void planetype(){
	System.out.println("Airbus");
}
}
 class Plane2 extends Plane {
public static void planecondition() {
	System.out.println("good");
	
}
public static void planedestination() {
	System.out.println("bangalore");
	
}
}

