package serializableDemo;

import java.io.Serializable;

public class Employee implements Serializable{

	/**
	 * Serialization converts objects into binary.
	 * if we covert binary to object is called deserialization.
	 * 
	 * SerialVersionUid is to take care of version .
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private double salary;
//	private transient double salary;   (This will make sure data is not stored)
	
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
	

}
