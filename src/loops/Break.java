package loops;

public class Break {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<10) {
			
			if(i>=6) {
				break;
			}	
			i++;
		}
		
		System.out.println(i);

	}

}
