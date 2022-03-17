package Inheritance;
public class Calculator {
    public int add(int i,int j) {
  	  return i+j;
    }
}
public class CalcAdv extends Calculator {
	public int sub(int i,int j) {
		return i-j;
	}

}

public class CalcVeryAdv extends CalcAdv {
    public int mul(int i,int j) {
   	 return i*j;
    }
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CalcVeryAdv c=new CalcVeryAdv();
        int r1=c.add(5,5);
        int r2=c.sub(7,4);
        int r3=c.mul(1,4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
	}

}