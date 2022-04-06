package multiTreading;

public class ExtendThreadDemo {
	
	/*
	 *  Processes - Independent unit with their own separate resources so inter-process communication is expensive.
	 *  Threads - Shares the resources with in a process so inter-thread communication is easy but at same time requires special 
	 *  			attention to safe guard shared resources among them.
	 */

	public static void main(String[] args) {
		System.out.println("In main method = "+Thread.currentThread().getName());
		// Thread is parent class so it can hold the object of the child class.
		Thread t1 = new TThread();
		// We can't call run method directly, we can call start method and this will schedule the threads,and run method will be called internally. 
		t1.start();
		

		// creating an object and calling start method directly.
		new TThread().start();
		
	}

}

class TThread extends Thread{
	
	
	/*
	 * 	run method should be Override but should not be called directly.
	 * 	start method to be called instead of run.
	 * 	There is a thread class and even interface called (Runnable).
	 */	
	
	
	 		
	@Override
	public void run(){
		System.out.println("Executed by thread = "+Thread.currentThread().getName());
	}
	
}
