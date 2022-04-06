package practice.handsOn4;

public class Question1StudentClassMain {

	public static void main(String[] args) {
		
		// Using No argument Constructor
		
		Question1StudentClass sc1 = new Question1StudentClass();
		// Initializing value using set method.
		sc1.setId(01);
		sc1.setName("Akshay");
		// Printing values using get Method.
		System.out.print("Id : "+sc1.getId());
		System.out.println(" Name : "+sc1.getName());
		
		Question1StudentClass sc2 = new Question1StudentClass();
		sc2.setId(02);
		sc2.setName("Brijesh");
		System.out.print("Id : "+sc2.getId());
		System.out.println(" Name : "+sc2.getName());
		
		// Using argument Constructor to pass the value.
		Question1StudentClass sc3 = new Question1StudentClass(03,"Rahul");
		// display method to display both id and name.
		sc3.display();
	}

}
