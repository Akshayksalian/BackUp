package collectionFramework;

import java.util.Objects;

public class PersonCollectionClass {

	private String name;
	private int age;
	
	public PersonCollectionClass(String name,int age){
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result =1;
		result = prime * result + ((name==null)? 0 : name.hashCode());
		
		return result; 
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonCollectionClass other = (PersonCollectionClass) obj;
		return age == other.age||Objects.equals(name, other.name);
//		if(name == null) {
//			if(other.name != null) 
//				return false;
//		}else if(!name.equals(other.name)) 
//				return false;
//		return true;
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
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
