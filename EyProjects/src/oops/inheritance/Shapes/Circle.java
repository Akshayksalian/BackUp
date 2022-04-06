package oops.inheritance.Shapes;

public class Circle extends Shape{
	
	// length is used as radius.
	
	Circle(int length){
		super(length,0);
	}
	
	public void circleArea() {
		double result = Math.PI*getLength()*getLength();   // pi r square
		System.out.println("Area of circle = "+result);
	}

}
