package comparablecheck;

import java.util.Comparator;

public class SalaryComparator implements Comparator<employee> {
	
	public int compare(employee o1,employee o2) {
		employee e1=(employee)o1;
		employee e2=(employee)o2;
	
	
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary>e2.salary)
			return 1;
			else return -1;
	}
	 

}
