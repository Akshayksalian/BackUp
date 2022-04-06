package practice.handsOn7And8;

public class Que11Student implements Comparable<Que11Student>{
	
	private int rollno;
	private String name;
	private int age;
	
	public Que11Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Que11Student o) {
		return this.name.compareTo(o.getName());
	}	
	
	
}
