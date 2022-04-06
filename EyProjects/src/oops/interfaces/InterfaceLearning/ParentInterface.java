package oops.interfaces.InterfaceLearning;

public interface ParentInterface extends SimpleParent{		// only one interface can be extended
	
	public static final int  i = 10;
	int j = 20;	// even though if we don't specifies them it will have default of "public static final". 
	String str = "Hello";
	
	public abstract int add(int a,int b);
	int sub(int a,int b);				// by  default it is "public abstract".
	
	default String hello() { 			// "default" keyword should be used to write a method in interface.
		return "Hello";
	}
	
}
