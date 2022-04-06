package practice.handsOn4;

public class Question1StudentClass {
	
	private int id;
	private String name;
	
	Question1StudentClass(){
	}
	
	Question1StudentClass(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Id : "+getId()+" Name : "+getName());
	}
	
}
