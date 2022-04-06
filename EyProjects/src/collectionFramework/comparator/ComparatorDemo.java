package collectionFramework.comparator;
import java.util.*;
import collectionFramework.PersonCollectionClass;

public class ComparatorDemo {

	public static void main(String [] args) {
		
//		Comparator
		Set<PersonCollectionClass> personList = new TreeSet<>(new AgeComparator());
		
		PersonCollectionClass p2 = new PersonCollectionClass("Rahul",78);
		PersonCollectionClass p1 = new PersonCollectionClass("Akshay",21);
		
		personList.add(p1);
		personList.add(p2);
		

		
		for(PersonCollectionClass x : personList) {						
			System.out.println(x);			
		}
		
		System.out.println("\nArrayList");
		
		List<PersonCollectionClass> personList1 = new ArrayList<>();
		
		PersonCollectionClass p3 = new PersonCollectionClass("Rahul",78);
		PersonCollectionClass p4 = new PersonCollectionClass("Akshay",41);
		
		personList1.add(p3);
		personList1.add(p4);
		
//		using separate class.
//		personList1.sort(new AgeComparator());	

		
//		Using lambda
		Collections.sort(personList1,(PersonCollectionClass o1,PersonCollectionClass o2) -> Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge())));
		
		for(PersonCollectionClass x : personList1) {						
			System.out.println(x);			
		}
	}
}
