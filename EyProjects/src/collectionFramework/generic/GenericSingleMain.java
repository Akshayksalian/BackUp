package collectionFramework.generic;

public class GenericSingleMain {

	public static void main(String[] args) {
		
		GenericSingle<Integer> gs = new GenericSingle<>();
		gs.add(10,20);

		GenericSingle<String> gs1 = new GenericSingle<>();
		gs1.add("Akshay","Salian");
	}

}
