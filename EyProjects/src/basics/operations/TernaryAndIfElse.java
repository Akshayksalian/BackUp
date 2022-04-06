package basics.operations;

public class TernaryAndIfElse {

	public static void main(String[] args) {
		
		int transactions = 15;
		
		checking c = new checking();
		c.ternary(transactions);
		c.ifElse(transactions);
		

	}
	
}

class checking{
	
	public void ternary(int num) {
		System.out.println((num<=5) ? ("ok") : (num>5 && num<10)? ("notify") : ("warning"));
	}
	
	public void ifElse(int num) {
		
		if(num<=5) {
			System.out.println("Ok");
		} else if(num>5 && num<10){
			System.out.println("Notifying the User");
		} else {
			System.out.println("Warning");
		}
	}
	
}
