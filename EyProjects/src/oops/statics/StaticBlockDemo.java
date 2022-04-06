package oops.statics;

public class StaticBlockDemo {

	static final int i;
	static int b;
	
	static {
		System.out.println("In static Block");
		i = 5;
		b = 10;
		System.out.println(i*b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("In main method \nStatic method is executed first");

	}

}
