package practice.handsOn5;

public class Que1Programmer extends Que1Employee{
	
	private int bonus;
	private float totalSalary;
	
	public Que1Programmer(float salary,int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public float getTotalSalary() {
		return totalSalary;
	}

	public void calculatingTotalSalary() {
		this.totalSalary = getBonus()+getSalary();
		System.out.println("Total Salary after adding bonus is = "+getTotalSalary());
	}

}
