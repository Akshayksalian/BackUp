package practice.handsOn5;

public class Que4Main {
	public static void main(String[] args) {
		
		Que4Sbi sbi = new Que4Sbi();
		sbi.getRateOfInterest("SBI",5.8f);
		
		Que4Icici icici = new Que4Icici();
		icici.getRateOfInterest("ICICI",6.4f);
		
		Que4Axis axis = new Que4Axis();
		axis.getRateOfInterest("AXIS",7.1f);
		
	}
}
