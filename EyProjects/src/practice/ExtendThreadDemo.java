package practice;

public class ExtendThreadDemo {

	public static void main(String[] args) {
		System.out.println("In main method = "+Thread.currentThread().getName());
		esaf e = new esaf();

		int h = e.arr1;
		System.out.println(h);
		Thread t1 = new TThread();
		t1.start();
		new TThread().start();
		

		
	}

}

class TThread extends Thread{
	
	
	@Override
	public void run(){
		
	}
	
}

class esaf{
	
	public int arr1=2;
	public void sd(){
		int arr =1 ;
		 arr= arr+arr1;
		 arr1 =arr;
	}
}
