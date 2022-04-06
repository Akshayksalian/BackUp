package entities.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/*
 * Table per class will make a two tables in employee table also it includes all the field of the parent class (Person)
 * 
 * in Joined it is will automatically decide int which tabel to place the items.
 * (Joined table is prepared to be used ) 
 */

@Entity
@Table(name = "person")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)			// for table per class we use auto
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
