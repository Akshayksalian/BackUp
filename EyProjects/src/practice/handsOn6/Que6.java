package practice.handsOn6;

class School{
	
	private String name;
	
	public School(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	class Student{
		private String name;

		public Student(String name) {
			super();
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void describe() {
			System.out.println("Student Name : "+this.name+" School Name : "+School.this.getName());
		}
		
	}
}

public class Que6 {

	public static void main(String[] args) {
		
		School s = new School("Shanthi Nikethana School");
		School.Student stud1 = s.new Student("Akshay");
		stud1.describe();

	}

}
