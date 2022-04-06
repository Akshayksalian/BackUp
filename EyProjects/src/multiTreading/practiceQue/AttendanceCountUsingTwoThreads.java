package multiTreading.practiceQue;

import java.util.Scanner;

public class AttendanceCountUsingTwoThreads {
	
	public static int[] arr1;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

			System.out.println("Enter element count");
			int n = s.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			s.close();
			arr1 = arr;
			
			Thread t1 = new TThread1();
			t1.start();

			Thread t2 = new TThread2();
			t2.start();
			
			try {
			t1.join();
			t2.join();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println(AttendancePercentage.count);
			

	}

}

class AttendancePercentage {

	public int[] getArr() {
		return AttendanceCountUsingTwoThreads.arr1;
	}
	
	public static int count;
	
	public void countFirstHalf(int[] arr) {
		int start = 0;
		int end = arr.length / 2;
		int count = 0;
		for (int i = start; i < end; i++) {
			if (arr[i] == 100) {
				count++;
			}
		}
		AttendancePercentage.count = AttendancePercentage.count+count;
	}

	public void countSecondHalf(int[] arr) {
		int start = (arr.length / 2) + 1;
		int end = arr.length;
		int count = 0;
		for (int i = start; i < end; i++) {
			if (arr[i] == 100) {
				count++;
			}
		}
		AttendancePercentage.count = AttendancePercentage.count+count;
	}
}

class TThread1 extends Thread {

	@Override
	public void run() {
		AttendancePercentage ap = new AttendancePercentage();
		 ap.countFirstHalf(ap.getArr());
	
		}
	}

class TThread2 extends Thread{
  
  @Override
  public void run(){
      AttendancePercentage ap = new AttendancePercentage();
      ap.countSecondHalf(ap.getArr());
  }
}
