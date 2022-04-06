package oops.inheritance.Shapes;

public class Cuboid extends Shape{  // Child Class
	
	int height;
	
	// super should be a first thing to be written in method or may be in constructor.
	Cuboid(int length,int breadth,int height){
		super(length,breadth);					// arguments are passed through parents class.
		this.height = height;
	}
	
	@Override
	public void display() {
		super.display();						// calling the parents display method.
		System.out.println(this.height);
	}
	
	
	public void cuboidArea() {
		double result = 2 *((getLength()*getBreadth())+(getBreadth()*this.height)+(getLength()*this.height));		//  2 (lb + bh + lh)
		System.out.println("Area of cuboid is = "+result);
	}

}
