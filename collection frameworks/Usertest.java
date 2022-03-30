package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class usertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User u1=new User(3,"Venkat");
User u2=new User(8,"kiat");
User u3=new User(7,"nikit");
User u4=new User(2,"Eshwar");
List<User> lis=new ArrayList<User>();
lis.add(u1);
lis.add(u2);
lis.add(u3);
lis.add(u4);
Collections.sort(lis);
for(User user:lis) {
	System.out.println(user);
}
	}

}
