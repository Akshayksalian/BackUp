package multiTreading;

class Counter{
	
	/*
	 * Synchronized will ensure that only one thread can access the shared resources.
	 */
	
	public synchronized void increment() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" i - "+i);
		}
	}
	
	public synchronized void decrement() {
		for(int i=5;i>0;i--) {
		System.out.println(Thread.currentThread().getName()+" i - "+i);
		}
	}
}

public class SynchronizedDemo {
	
	public static void main(String[] args) {
		
		Counter ctr = new Counter();
		Thread t1Thread = new Thread("Increment") {			// directly implementing run method while creating object. (Run method must and should be ovveriden )
			@Override
			public void run() {
				ctr.increment();
			};
		};
		
		Thread t2Thread = new Thread("Decrement") {
			@Override
			public void run() {
				ctr.decrement();
			};
		};

		t1Thread.start();
		t2Thread.start();
	}
}
