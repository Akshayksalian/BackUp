package exceptionHandlings.practiceQue;

import java.util.*;

public class Question10ResturantMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			Question10Resturant r = new Question10Resturant();
			int n = r.order("Masala Dosa");
			
			try {
				check(n);
				System.out.println("Available");
			} catch(DishNotAvailableException d) {
				System.out.println(d.getMessage());
			} finally {
				System.out.println("Press 'Bye' to exit");
				String str = s.nextLine();
				if(str.equals("Bye")) {
					break;
				}

			}
		}
		s.close();
	}
	
	public static void check(int n) throws DishNotAvailableException{
		Random r = new Random();
		int rnum = r.nextInt(1);
		
		if(rnum!=n) {
			throw new DishNotAvailableException();
		}
		

	}

}

class DishNotAvailableException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return getMessage();
	}
	
	public String getMessage() {
		return "Dish is not available";
	}
}
