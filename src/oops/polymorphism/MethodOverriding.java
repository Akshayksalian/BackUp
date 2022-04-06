package oops.polymorphism;

class Parent{
	int i;
	Parent(int i){
		this.i = i;
	}
	Parent(){
		
	}
	
	public void display() {
		System.out.println("Value of  i = "+i);
	}
}

class Child extends Parent{
	int j;
	Child(int j){
		this.j = j;
	}
	
	@Override
	public void display() {
		System.out.println("Value of  i = "+i);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Parent objParent = new Parent(7);
		objParent.display();
		
		objParent = new Child(15);				// Parents class object can hold the object of child class also.
		objParent.display();
	}

}
