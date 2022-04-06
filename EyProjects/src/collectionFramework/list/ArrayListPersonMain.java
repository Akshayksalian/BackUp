package collectionFramework.list;
import java.util.*;

import collectionFramework.PersonCollectionClass;
public class ArrayListPersonMain {

	public static void main(String[] args) {
		
		List<PersonCollectionClass> p = new ArrayList<>();
		PersonCollectionClass per1 = new PersonCollectionClass("Akshay",21);
		p.add(per1);
		PersonCollectionClass per2 = new PersonCollectionClass("Dixith",43);
		p.add(per2);
		
		
		// person is printing because of toString method in Person class. or else it will print memory address.
		
		for(PersonCollectionClass x : p) {						
			System.out.println(x);			
		}
	}

}
