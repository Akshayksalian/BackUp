package lamdaExpressions.practice;

import java.util.function.BiFunction;

class Arithmetic {

	static int add(int a,int b) {
		return a+b;
	}
	
	static float add(float a,int b) {
		return a-b;
	}
	
	static float add(float a,float b) {
		return a*b;
	}

}


public class ArithmeticMain{
	public static void main(String[] args) {
	
		BiFunction<Integer,Integer,Integer> bi1 = Arithmetic :: add;
		BiFunction<Float,Integer,Float> bi2 = Arithmetic :: add;
		BiFunction<Float,Float,Float> bi3 = Arithmetic :: add;
		
		System.out.println(bi1.apply(10, 20));
		System.out.println(bi2.apply(15.5f, 5));
		System.out.println(bi3.apply(57.1f,45.3f));
	}
}

