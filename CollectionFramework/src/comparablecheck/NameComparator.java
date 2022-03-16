package comparablecheck;

import java.util.Comparator;

public class NameComparator implements Comparator<employee> {
	
	public int compare(employee o1,employee o2) {
		employee e1=(employee)o1;
		employee e2=(employee)o2;
	
	return e1.name.compareTo(e2.name);
	}
	

}
