package multiTreading;

public class ThreadPriority {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new NumThread(),"Thread 1");
		Thread t2 = new Thread(new NumThread(),"Thread 2");
		Thread t3 = new Thread(new NumThread(),"Thread 3");
		
		// Max_Priority is 10
		// Min_Priority is 1
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(6);
		t3.setPriority(1);	
		// Even the priority is mentioned it doesn't run the thread based on that only, it even depends up on the JVM priority and also OS priorities.
	
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Without join method it can execute any where ");
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Join will help to execute only after the mentioned threads have done there work.");
		
	}
}

class NumThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Priority of "+Thread.currentThread().getName()+" is "+Thread.currentThread().getPriority());
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000);		// in milliseconds	(suspended for 2 seconds) 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==1) {
				System.out.println("Yield here this will stop this and run the next one");
				Thread.yield();
			}
		}
		// to see how time shared manner works.
	}
	
}
