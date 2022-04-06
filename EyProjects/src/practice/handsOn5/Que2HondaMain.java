package practice.handsOn5;

class Que2Honda extends Que2Bike{

	@Override
	public void run(String name) {
		System.out.println("Run method from Bike class overriden in honda class. \ncar : "+name);
	}

}

public class Que2HondaMain{ 
	public static void main(String[] args) {
		
		Que2Honda honda = new Que2Honda();
		honda.run("Honda city");
		
	}
}