package oops.interfaces.InterfaceLearning;

public class InterfacesMain {
	public static void main(String [] args) {
		
		ParentInterface pi ;
		
		pi = new ChildInterfaces();
		System.out.println(pi.add(50,20));
		System.out.println(pi.sub(50, 20));
		
	}
}
