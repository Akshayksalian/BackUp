package collectionFramework.set;

import java.util.*;
import collectionFramework.PersonCollectionClass;

public class PersonSetMain {
public static void main(String[] args) {
		
		Set<PersonCollectionClass> p = new HashSet<>();
		PersonCollectionClass per1 = new PersonCollectionClass("Akshay",21);
		p.add(per1);
		PersonCollectionClass per2 = new PersonCollectionClass("Dixith",43);
		p.add(per2);
		PersonCollectionClass per3 = new PersonCollectionClass("Dixith",45);
		p.add(per3);
		
		System.out.println(per2.equals(per3));
		
		// person is printing because of toString method in Person class. or else it will print memory address.
		for(PersonCollectionClass x : p) {						
			System.out.println(x);			
		}
	}

}
