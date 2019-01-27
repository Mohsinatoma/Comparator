package Assignment2.Assignment2;

import static org.junit.Assert.*;
import java.util.Comparator;
import org.junit.Test;
import java.util.*;
public class Employeetest {

	@Test
	public void sortbyage(){
		
		ArrayList<Employee> ar = new ArrayList<Employee>(); 
        ar.add(new Employee(111,12111,"bbbb","london")); 
        ar.add(new Employee(131,1245,"aaaa","nyc")); 
        ar.add(new Employee(121,35463,"cccc","jaipur"));
        
       // assertNotNull(ar);
        ArrayList<Employee> arr = new ArrayList<Employee>();
       // arr=ar;
       
        arr.add(new Employee(111,12111,"bbbb","london")); 
        arr.add(new Employee(121,35463,"cccc","jaipur"));
        arr.add(new Employee(131,1245,"aaaa","nyc"));
        
       //// assertNotNull(arr);
        
        
        Collections.sort(ar, new Comparator<Employee>(){
     	   public int compare(Employee a, Employee b) {
     			return a.age - b.age;
     		}
     		
     	});
        System.out.println(ar);
        System.out.println(arr);
        
        //as(arr,ar);
     //  assertEquals(arr, ar);
       // arr=ar;
       assertEquals(arr, ar);
       
		
	}
public void sortbyincome(){
		
		ArrayList<Employee> ar = new ArrayList<Employee>(); 
		
		ar.add(new Employee(111,12111f,"bbbb","london")); 
        ar.add(new Employee(131,1245f,"aaaa","nyc")); 
        ar.add(new Employee(121,35463f,"cccc","jaipur"));
        
        
       // assertNotNull(ar);
        ArrayList<Employee> arr = new ArrayList<Employee>();
       // arr=ar;
        arr.add(new Employee(131,1245f,"aaaa","nyc"));
        arr.add(new Employee(111,12111f,"bbbb","london")); 
        arr.add(new Employee(121,35463f,"cccc","jaipur"));
        
       //// assertNotNull(arr);
        
      
        
       Collections.sort(ar, new Comparator<Employee>(){
    	   public int compare(Employee a, Employee b) {
    		    float aa=a.income;
    		    float bb=b.income;
    		    if(Math.abs(aa)==Math.abs(bb)) {return 1;}
    		    
    			return 0;
    		}
    		
    	});
        
       
        
	}
	
	
	
	

}
