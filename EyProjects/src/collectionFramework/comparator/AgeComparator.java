package collectionFramework.comparator;

import java.util.Comparator;

import collectionFramework.PersonCollectionClass;

public class AgeComparator implements Comparator<PersonCollectionClass>{

	@Override
	public int compare(PersonCollectionClass o1, PersonCollectionClass o2) {
		return Integer.valueOf(o1.getAge()).compareTo(Integer.valueOf(o2.getAge()));
	}

	
}
