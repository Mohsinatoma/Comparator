package Assignment2.Assignment2;

import java.util.Comparator;


public class Sortbyincome implements Comparator<Employee> {

	public int compare(Employee a, Employee b) {
		return a.income - b.income;
	}
	
}
