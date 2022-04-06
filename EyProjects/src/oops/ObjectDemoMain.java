package oops;

public class ObjectDemoMain {

	public static void main(String[] args) {
		
		ObjectsDemo od1 = new ObjectsDemo("Akshay",20,545.15);
		
		System.out.println(od1.toString());
		System.out.println(od1.hashCode());
		
		ObjectsDemo od2 = new ObjectsDemo("Abhi",40,724.15);
		System.out.println(od2.toString());
		System.out.println(od2.hashCode());

		
		System.out.println(od1.equals(od2)); 				 // it will be false so change few condition in .equals
	}

}
