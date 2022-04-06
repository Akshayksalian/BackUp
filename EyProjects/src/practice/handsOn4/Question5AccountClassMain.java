package practice.handsOn4;

public class Question5AccountClassMain {

	public static void main(String[] args) {
		
		Question5AccountClass ac = new Question5AccountClass(45213486,"Akshay","akshay@gmail.com",5435165.42f);
		System.out.println(ac);
		// able to print object directly because toString() method is used in Account class.

		Question5AccountClass ac1 = new Question5AccountClass();
		ac1.setAccountNum(51653153);
		ac1.setName("Brijesh");
		ac1.setEmail("brijeshYadav@gmail.com");
		ac1.setAmount(26515.54f);
		System.out.println(ac1);
	}

}
