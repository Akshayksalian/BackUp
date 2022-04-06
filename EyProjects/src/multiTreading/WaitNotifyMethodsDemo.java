package multiTreading;
import java.util.*;

class Producer implements Runnable{
	
	private LinkedList<Integer> list;
	
	Producer(LinkedList<Integer> list){
		this.list = list;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized (list) {
				while(list.size()>=1) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			System.out.println("Producing the queue = "+Thread.currentThread().getName()+" at index is = "+i);
			list.add(i);
			list.notify();
			}
		}
	}
	
}

class Consumer implements Runnable{
	
	private LinkedList<Integer> list;
	
	Consumer(LinkedList<Integer> list){
		this.list = list;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list){
				while(list.size()<1){
					try {
						list.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Consuming from queue = "+Thread.currentThread().getName()+" at index = "+i);
				list.notify();
				list.remove();
			}
		}
	}
}

public class WaitNotifyMethodsDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		Thread t1 = new Thread(new Producer(list),"Producer");
		Thread t2 = new Thread(new Consumer(list),"Consumer");
		
		t1.start();
		t2.start();

	}

}
