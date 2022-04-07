/**
 * 
 */
package collections;

import java.util.Comparator;

/**
 * @author jansi reddy
 *
 */
public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
if(e1.sal==e2.sal)
		return 0;
else if(e1.sal>e2.sal)
	return 1;
else return-1;
	}

}
