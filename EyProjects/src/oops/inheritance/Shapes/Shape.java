package oops.inheritance.Shapes;

public class Shape { 			// Parent Class
	
	private int length;
	private int breadth;
	
	Shape(int length,int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void display() {
		System.out.print(length+" "+breadth+" ");
	}

}
