package collectionFramework.list;

public class ClassStudentForScholarship {

	private String name;
	private char grade;
	private double totalMaarks;
	
	public ClassStudentForScholarship(String name, char grade, double totalMaarks) {
		this.name = name;
		this.grade = grade;
		this.totalMaarks = totalMaarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", grade=" + grade + ", totalMaarks=" + totalMaarks + "]";
	}

	public double getTotalMaarks() {
		return totalMaarks;
	}

	public void setTotalMaarks(double totalMaarks) {
		this.totalMaarks = totalMaarks;
	}
	
	
	
}
