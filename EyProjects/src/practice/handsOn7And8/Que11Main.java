package practice.handsOn7And8;

import java.util.ArrayList;

public class Que11Main {

	public static void main(String[] args) {
		
		ArrayList<Que11Student> arrList = new ArrayList<>();
		
		Que11Student stud1 = new Que11Student(1,"Rahul",25);
		arrList.add(stud1);
		
		Que11Student stud2 = new Que11Student(2,"Akshay",21);
		arrList.add(stud2);
		
		Que11Student stud3 = new Que11Student(3,"Deepak",22);
		arrList.add(stud3);
		
		arrList.sort(null);
		// sort is based on names
		// sort algorithm is mentioned in Student Class.
		
		for(Que11Student x : arrList) {
			System.out.println(x);
		}
	}

}
