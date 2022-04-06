package practice.handsOn6;

class Car {
	private String make;
	
    public Car(String make) {
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + "]";
	}


	class Wheels {
		private String make;

		public Wheels(String make) {
			this.make = make;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		@Override
		public String toString() {
			return "Wheels [make=" + make + "]";
		}		
		
    }
}

public class Que5{
    public static void main(String[] args){
    	
    	Car c = new Car("Maruthi");
    	Car.Wheels wheels1 = c.new Wheels("MRF");
    	Car.Wheels wheels2 = c.new Wheels("MRF");
    	Car.Wheels wheels3 = c.new Wheels("MRF");
    	Car.Wheels wheels4 = c.new Wheels("MRF");
    	
    	System.out.println(c);
    	System.out.println(wheels1);
    	System.out.println(wheels2);
    	System.out.println(wheels3);
    	System.out.println(wheels4);
    
    }
}