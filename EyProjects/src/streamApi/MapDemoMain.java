package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemoMain {
	public static void main(String [] args) {
		
		List<Employee> myEmpList = createList();
		
		System.out.println("------Female Employees------");
		// Filter is argumnet is predicate
		// In Predicate most of time we use lambda.
		myEmpList.stream().filter(e -> e.getGender()=='F').map(e -> e.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("------Male Employees------");
		myEmpList.stream().filter(e -> e.getGender()=='M').map(e -> e.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("----------Total Salary----------");
		double totalSalary = myEmpList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(totalSalary);
		
		System.out.println("----------Total Salary for only Female----------");
		double totalSalaryMale = myEmpList.stream().filter(e -> e.getGender()=='F').mapToDouble(Employee::getSalary).sum();
		System.out.println(totalSalaryMale);
		
		// Converting emplist to map with specified key value pairs using Collectors.toMap
		Map<String,Double> map = myEmpList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(map);
	}
	
	public static List<Employee> createList() {
		
		List<Employee> empList = new ArrayList<>();
		
		Employee e1 = new Employee("Akshay",'M',545121.42);
		empList.add(e1);
		Employee e2 = new Employee("Brijeh",'M',47451.42);
		empList.add(e2);
		Employee e3 = new Employee("Indraja",'F',72511.42);
		empList.add(e3);
		Employee e4 = new Employee("Lakshmi",'F',12512.42);
		empList.add(e4);
		Employee e5 = new Employee("Chaitra",'F',35511.42);
		empList.add(e5);
		
		return empList;
	}
}
