package multiTreading.practiceQue;

import java.util.*;

class HallBooking implements Runnable{
	
	private String hallName;
	private double cost;
	private int hallCapacity;
	private int seatsBooked;
	
	public HallBooking(String hallName, double cost, int hallCapacity, int seatsBooked) {
		this.hallName = hallName;
		this.cost = cost;
		this.hallCapacity = hallCapacity;
		this.seatsBooked = seatsBooked;
	}
		
	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public int getHallCapacity() {
		return hallCapacity;
	}

	public void setHallCapacity(int hallCapacity) {
		this.hallCapacity = hallCapacity;
	}

	public double getCost() {
		return cost;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}


	@Override
	public void run() {
		if(getSeatsBooked()*100>getCost()) {
			System.out.println("Profit");
		} else {
			System.out.println("Loss");
		}
	}
	
}

public class Que2Profits {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		s.nextLine();
		
		for(int i=0;i<n;i++) {
			String str = s.nextLine();
			double c = s.nextDouble();
			int cp = s.nextInt();
			int sb = s.nextInt();
			s.nextLine();
			
			new Thread ( new HallBooking(str,c,cp,sb)).start();
		}
		
		s.close();
			
	}
}
