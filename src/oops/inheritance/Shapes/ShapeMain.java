package oops.inheritance.Shapes;

public class ShapeMain {

	public static void main(String[] args) {
		
		Cuboid cd = new Cuboid(4,5,6);
		cd.cuboidArea();
		cd.display();
		
		Rectangle r = new Rectangle(2,5);
		r.RectangleArea();
		
		Circle c = new Circle(5);
		c.circleArea();

	}

}
