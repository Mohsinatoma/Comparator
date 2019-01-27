package Assignment2.Assignment2;


import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	int age;
	float income;
	String name, dateofbirth;
	

	public Employee() {

	}

	public Employee(int age, float income, String name, String dateoftime) {
		this.age = age;
		this.income = income;
		this.name = name;
		this.dateofbirth = dateoftime;
	}

	public String toString() {
		return this.age + " " +this.income+" "+ this.name + " " + this.dateofbirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int compare(Employee a, Employee b) {
		// TODO Auto-generated method stub
		return a.age - b.age;
	}
	
	@Override
	public boolean equals(Object o) {
		Employee em=(Employee)o;
		int flag = 0;
		if(Math.abs(this.income)== Math.abs(em.getIncome())) {
			flag=1;
		}
		if(flag==1) {
		return this.age==em.getAge()
				&& this.name.equals(em.getName()) && this.dateofbirth.equals(em.getDateofbirth());}
		else
			return false;
		
		
		
	}
	
	
}


