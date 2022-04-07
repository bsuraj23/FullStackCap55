package set;

import java.util.HashSet;
import java.util.Set;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s=new HashSet();
		employee e1=new employee(1,"abc");
		employee e2=new employee(2,"bcd");
		s.add(e1);
		s.add(e2);
		
		System.out.println(s);
		
	
	}

}
