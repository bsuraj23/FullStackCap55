package comparablecheck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		user u1=new user(1,"Archana");
		user u2=new user(2,"bob roy");
		user u3=new user(3,"cianthi");
		user u4=new user(4,"dhru");
	
	List<user>list=new ArrayList<user>();
	
	list.add(u1);
	list.add(u2);
	list.add(u3);
	list.add(u4);
	
	Collections.sort(list);
	
	for(user user:list) {
		System.out.println(user);
	}
	
	
	}
	

}
