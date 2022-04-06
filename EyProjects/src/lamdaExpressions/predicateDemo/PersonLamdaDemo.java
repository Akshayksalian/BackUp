package lamdaExpressions.predicateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PersonLamdaDemo {

	public static void main(String[] args) {
		
		List<Person> personList = createList();
		
//		Predicates
//		For all female employee
		Predicate<Person> allFemales = p->p.getGender()=='F';
		List<Person> femalesList = getVerified(personList, allFemales);
		System.out.println("Female Employees = "+femalesList);
		
//		For seniorCitizen
		Predicate<Person> seniorCitizen = p->p.getAge()>=70;
		List<Person> seniors = getVerified(personList, seniorCitizen);
		System.out.println("Senior Citizens = "+seniors);

	}
	
	
	private static List<Person> getVerified(List<Person> pList,Predicate<Person> pred){
		List<Person> newList = new ArrayList<Person>();
			
			for(Person person : pList) {
				// returns boolean for given condition.(Condition is given in main class in the form of predicate)
				if(pred.test(person)) {
					newList.add(person);
				}
			}
			
			return newList;
	}
	
	
	private static List<Person> createList(){
		
		List<Person> tempList = new ArrayList<Person>();
		
		Person person = new Person("Akshay", "K", 21, 'M');
		tempList.add(person);
		
		person = new Person("shekar", "padsha", 80, 'M');
		tempList.add(person);
		
		person = new Person("Anusha", "kumari", 20, 'F');
		tempList.add(person);
		
		person = new Person("Sharanya", "joseph",18, 'F');
		tempList.add(person);
		
		return tempList;
	}

}
