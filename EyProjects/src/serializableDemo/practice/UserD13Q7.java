package serializableDemo.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class UserD13Q7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		write(n,s);

	}
	
	public static void write(int n,Scanner s) {
		
		ArrayList<Employee1> empList = new ArrayList<>() ;
		
		for(int i=0;i<n;i++) {
			
			String str = s.next();
			int exp = s.nextInt();
			double sal = s.nextDouble();
			
			empList.add(new Employee1(str,exp,sal));
			
		}
		
		// try and resource will automatically closes the resourses.
		try(FileOutputStream fos = new FileOutputStream("D:\\JavaAndReact\\empHandsOn12.ser")){
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			for(int i=0;i<n;i++) {
				oos.writeObject(oos);
			}

		} catch(IOException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Write Successfull");
		
	}

}

class Employee1{
	
	private String name;
	private int exp;
	private double salary;
	
	public Employee1() {
	}
	
	public Employee1(String name, int exp, double salary) {
		this.name = name;
		this.exp = exp;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}
	
}
