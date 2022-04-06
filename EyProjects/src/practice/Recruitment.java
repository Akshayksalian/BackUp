package practice;

import java.util.ArrayList;

public class Recruitment {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrList = new ArrayList<>();
		
		Employee a = new Employee("Akshay",5,"MBA");
		arrList.add(a);
		Employee b = new Employee("Rahul",4,"MBA");
		arrList.add(b);
		Employee c = new Employee("Brijesh",6,"MBA");
		arrList.add(c);
		Employee d = new Employee("Dinesh",1,"MBA");
		arrList.add(d);
		Employee e = new Employee("Chandan",8,"MBA");
		arrList.add(e);
		
		ArrayList<Employee> result = new ArrayList<>();
		
		int counter=0;
		for(int i=0;i<Employee.getEmpCounter();i++) {
			
			if(counter==3) {
				break;
			}
			
			if(arrList.get(i).getExp()>=5) {
				if(arrList.get(i).getDegree()=="MBA") {
					result.add(arrList.get(i));
					counter++;
				}
			}
		}
		
		System.out.println(result);
		System.out.println(counter);
	}

}
