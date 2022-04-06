package conditionalStatements;

public class Switch_quarter {

	public static void main(String[] args) {
		
		int num = 3;
		
		switch(num) {
			case 1:
			case 2:
			case 3: System.out.println("Quarter 1");
			    	break;
			case 4: 
			case 5:
			case 6: System.out.println("Quarter 2");
			 		break;
			case 7:
			case 8:
			case 9:System.out.println("Quarter 3");
			 		break;
			case 10:
			case 11:
			case 12:System.out.println("Quarter 4");
			 		break;
			default:System.out.println("Wrong Input");
		}

	}

}
