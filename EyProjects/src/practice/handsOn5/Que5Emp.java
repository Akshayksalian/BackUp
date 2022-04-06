package practice.handsOn5;

public class Que5Emp extends Que5Person{

	private float salary;

	Que5Emp(int id, String name, float salary) {
		
		// Using the parent class constructor from child class using super keyword.
		super(id, name);
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Id : "+getId()+" Name : "+getName()+" Salary : "+getSalary());
	}
	
	
}
