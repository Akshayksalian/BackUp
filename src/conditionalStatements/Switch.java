package conditionalStatements;

public class Switch {

	public static void main(String[] args) {
		
		int num = 6;
		
		switch(num/2){
			case 1:System.out.println("Day");
					break;
			case 2:System.out.println("Month");
					break;
			case 3:System.out.println("Year");
					break;
			default:System.out.println("No proper input");
			// default statement is not compulsory
		}

	}

}
