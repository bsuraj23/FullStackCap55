package datastructures;
import java.util.*;
class Stu{
	Integer ma;
	String na;
	public Stu(int ma,String na) {
		this.ma=ma;
		this.na=na;
	}
}
public class ArayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stu> as=new ArrayList<Stu>();
		int marks,b=0;
		String name;
		Scanner s=new Scanner(System.in);
	    int choice;
	    lab:for(;;) {
	    	System.out.println("enter your choice 1:add, 2:display, 3:remove the given variable, 4:remove at a position, 5:to know the size, 6:exit");
	    	System.out.println("7:remove all");
	    	choice=s.nextInt();
	    	switch(choice) {
	    	case 1:
	    		
	    		System.out.println("enter the marks");
	    		int y=s.nextInt();
	    		System.out.println("enter name of the student");
	    		String x1=s.next();
	    		Stu t=new Stu(y,x1);
	    		as.add(t);
	    		break;
	    	case 2:
	    		Iterator<Stu> ls=as.iterator();
	    		int i=1;
	    		if(as.size()==0) {
	    			System.out.println("there is nothing to display");
	    		}
	    		else {
	    		while(ls.hasNext()) {
	    			Stu h=ls.next();
	    			System.out.println("__________________________________________________");
	    			System.out.println("the name of the "+i+" is "+h.na);
	    			System.out.println(h.na+" got "+h.ma+" marks");
	    			i++;
	    		}
	    		System.out.println("__________________________________________________");
	    		}
	    		break;
	    	case 3:
	    		String m;
	    		if(as.size()==0) {
	    			System.out.println("the list is empty");
	    		}
	    		else {
	    		System.out.println("enter the student name to be removed ");
	    		m=s.next();
	    		boolean x=false;
	    		try {
	    		for(Stu u:as) {
	    			if(m.equals(u.na)) {
	    				as.remove(u);
	    				x=true;
	    			}
	    		}
	    		}
	    		catch(Exception e) {
	    			
	    		}
	    		if(x) {
	    			System.out.println(m+" has removed from the list");
	    		}
	    		else {
	    			System.out.println(m+" is not there in the list");
	    		}
	    		}
	    		break;
	    	case 4:
	    		int n;
	    		System.out.println("enter the position");
	    		n=s.nextInt();
	    		if(n>as.size()) {
	    			System.out.println("the position which you have entered is not there in the list");
	    		}
	    		else {
	    		as.remove(n);
	    		}
	    		break;
	    	case 5:
	    		System.out.println("the size of the list is "+as.size());
	    		break;
	    	case 6:
	    		System.out.println("THANKS............");
	    		break lab;
	    	case 7:
	    		if(as.size()==0) {
	    			System.out.println("the list is empty");
	    		}
	    		else {
	    		boolean w = as.removeAll(as);
	    		if(w) {
	    			System.out.println("all elements are removed from the arraylist");
	    		}
	    		else {
	    			System.out.println("elements are not removed from the list");
	    		}
	    		}
	    		break;
	    	default :
	    		System.out.println("wrong input");
	    		
	    	}
	    }
	}

}
