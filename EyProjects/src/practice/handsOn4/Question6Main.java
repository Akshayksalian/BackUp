package practice.handsOn4;

import practice.exception.Question6Mammal;

public class Question6Main {

	public static void main(String[] args) {
		
		Question6Animal animal1 = new Question6Animal("Humans");
		Question6Mammal mammal1 = new Question6Mammal("Placental",animal1);
		
		System.out.println(mammal1);
		// Calling directly because used toString() method in class Question6Mammal.
		
		Question6Animal animal2 = new Question6Animal("Platypus");
		Question6Mammal mammal2 = new Question6Mammal("Monotremes",animal2);
		
		System.out.println(mammal2);
		
	}

}
