package multiTreading;

public class RunnableThreadDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new RThread());
		t1.start();
		
		// Constructor arguments.
		Thread t2 = new Thread(new RThread(),"MyThread-077");
		t2.start();
		
		new Thread(new RThread()).start();
	}

}

/*
 * Runnable interface was introduced because Thread class can't be implemented if it is already extends any other class.
 */

class RThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Executed by thread = "+Thread.currentThread().getName());
	}
	
}
