package oops.statics;

public class ObjectCounter {
	
	// This static keeps only one reference for all the objects.
	// if u remove static new count will be created for there respective objects.
	private static int count = 0;

	public static void main(String[] args) {
		
		ObjectCounter obc1 = new ObjectCounter();
		obc1.incCount();
		
		ObjectCounter obc2 = new ObjectCounter();
		obc2.incCount();
		
		ObjectCounter obc3 = new ObjectCounter();
		obc3.incCount();
		
		obc2.display();
		

	}
	
	private void incCount() {
		count++;
	}
	
	private void display() {
		System.out.println(count);
	}

}
