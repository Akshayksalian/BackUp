package practice;

public class Employee{
	
	private static int empCounter = 0;
	private String name;
	 private int count;
	private int exp;
	private String degree;
	
	public Employee(String name,int exp,String degree) {
		this.count = ++Employee.empCounter;
		this.name = name;
		this.exp = exp;
		this.degree = degree;
	}
	
	public int getExp() {
		return exp;
	}

	public String getDegree() {
		return degree;
	}

	public static int getEmpCounter() {
		return empCounter;
	}

	@Override
	public String toString() {
		return "[Name = "+name+" exp = " + exp + " degree = " + degree + " count = "+count+"]";
	}
}