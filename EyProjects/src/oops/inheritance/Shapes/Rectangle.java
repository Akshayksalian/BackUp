package oops.inheritance.Shapes;

public class Rectangle extends Shape{

	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	
	public void RectangleArea() {
		System.out.println("Area of rectangle is = "+getLength()*getBreadth());
	}
	
}
