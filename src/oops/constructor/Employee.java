package oops.constructor;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private double salary;
	
	private static int empId = 0;

	Employee(String name,String dept,double salary){
		id = ++Employee.empId;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	// default constructor wont be there if we construct the constructor manually so we are building no argument constructor again below. 
	
//	Employee() {
//		
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void displaying() {
		System.out.println("Employee Id : "+getId()+"; Name : "+getName()+"; Department :"+getDept()+"; Salary :"+getSalary());
	}

	
	
	
}
