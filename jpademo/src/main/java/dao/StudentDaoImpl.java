package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entities.Student;
import mainClasses.JPAUtil;

public class StudentDaoImpl implements StudentDao{
	
	private EntityManager entityManager;
	
	public StudentDaoImpl(){
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student getStudentById(int id) {
		Student st = entityManager.find(Student.class, id);
		return st;
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);
		
	}

	@Override
	public void removeStudent(Student student) {
		entityManager.remove(student);
	}

	@Override
	public void updateStudent(Student student) {	
		entityManager.merge(student);
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

//	@Override
//	public List<Student> getStudentByName(String name) {
//		
//		// in parameter query og jpql we give Class name and field name not the database attribute names.
//		String queryStr = "Select s from Student s where s.name = :pname";
//		TypedQuery<Student> query = entityManager.createQuery(queryStr,Student.class);
//		query.setParameter("pname", name);
//		List<Student> stList = query.getResultList();
//		return stList;
//	}
	
	
	
	

	@Override
	public List<Student> getAllStudents() {
		TypedQuery<Student> query = entityManager.createNamedQuery("getAllStudents",Student.class);
		List<Student> stList = query.getResultList();
		return stList;
	}

	@Override
	public List<Student> getStudentByName(String name) {
		String queryStr = "Select s.id,s.name from student s where s.name = :pname";
		Query query = entityManager.createNativeQuery(queryStr,Student.class);
		query.setParameter("pname", name);
		List<Student> studentsList =(List<Student>) query.getResultList();
		return studentsList;
	}

}
