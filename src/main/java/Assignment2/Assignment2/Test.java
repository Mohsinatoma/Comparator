package Assignment2.Assignment2;

import java.util.*; 
import java.lang.*; 
import java.io.*;
public class Test {
	public static void main (String[] args) 
    { 
        ArrayList<Employee> ar = new ArrayList<Employee>();
        ArrayList<Employee> arr = new ArrayList<Employee>();
        ar.add(new Employee(111,11111, "bbbb", "london")); 
        ar.add(new Employee(131,10111, "aaaa", "nyc")); 
        ar.add(new Employee(121,21456 ,"cccc", "jaipur"));
        Employee em=new Employee();
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
        
        arr=(ArrayList<Employee>) ar.clone();
        Collections.sort(ar, new Sortbyincome());
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
        
        System.out.println("\n by rollno"); 
        for (int i=0; i<arr.size(); i++) 
            System.out.println(arr.get(i)); 
  
        
}
}
