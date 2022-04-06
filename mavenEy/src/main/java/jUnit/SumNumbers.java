package jUnit;

public class SumNumbers {

	public int sum(int a, int b) {
		if(a>=10)
			throw new IllegalArgumentException("Values should be greather than 10");
		return a+b;
	}
	
	public int subtraction(int a,int b) {
		return a-b;
	}

}
