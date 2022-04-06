package mainClasses;

import javax.persistence.EntityManager;

import entities.tablePerClass.Employee;
import entities.tablePerClass.Person;

public class EmpClient {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		
		Person p = new Person();
		p.setAge(24);
		p.setName("Akshay");
		em.persist(p);

		Employee e = new Employee();
		e.setName("Mahendra");
		e.setAge(21);
		e.setDepartment("cse");
		e.setSalary(80550.25);
		em.persist(e);
		
		em.getTransaction().commit();
		
		JPAUtil.cleanUp();
	}
}
