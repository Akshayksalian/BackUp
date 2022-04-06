package oops.wrapper;

public class TypeWrapper {

	public static void main(String[] args) {
		
		int i = 10;
		String str = "50";
		
		// String to integer
		int res = Integer.parseInt(str); 
		System.out.println(res);
		
		String s = String.valueOf(i);
		System.out.println(s);
	}

}
