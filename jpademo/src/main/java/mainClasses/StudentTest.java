package mainClasses;

import javax.persistence.EntityManager;

import entities.Student;

public class StudentTest {

	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		// persist Demo
//		Student st = new Student();
//		st.setName("Akshay");
//		
//		// persist will help to add this object into database.
//		em.persist(st);
		
//		// find Demo
//		Student std = em.find(Student.class,1);
//		System.out.println("Id : "+std.getStudentId());
//		System.out.println("Name : "+std.getName());
//		
//		// example of dirty checking
//		// this will run an update query automatically
//		std.setName("Bharath");

		System.out.println("Added one student ");
		em.getTransaction().commit();
		JPAUtil.cleanUp();

	}

}
