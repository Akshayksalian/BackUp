package practice.handsOn5;

public class Que3Sbi implements Que3Bank{
	
	public static void main(String[] args) {
		
		Que3Sbi s = new Que3Sbi();
		s.rateOfInterest(5.12f);
		
	}
	
	@Override
	public void rateOfInterest(float ineterest) {
		System.out.println("Rate of intreset in SBI is "+ineterest);
	}

}
