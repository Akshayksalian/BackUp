package multiTreading;

public class RaceConditionDemo {
	
	int counter=0;
	
	// public Synchronized void increment(){	(if we want to synchronize the whole method )
	public void increment() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		
		// Synchronized method 
		// this refers to the object created in the main class.
		synchronized(this){ 
			counter++;
			System.out.println("Value for "+Thread.currentThread().getName()+" "+this.counter);
		}
		
	}
	
	public int getCounter() {
		return counter;
	}

	public static void main(String[] args) {
		
		RaceConditionDemo rcd = new RaceConditionDemo();
		
		for(int i=0;i<10;i++) {
		Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					rcd.increment();
				}
			});
			t1.start();
		}

	}
}
