package service;

import java.util.List;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entities.Student;

public class StudentServiceImpl implements StudentService{
	
	private StudentDao dao;
	
	public StudentServiceImpl() {
		dao = new StudentDaoImpl(); 
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
	}

	@Override
	public Student findStudentById(int id) {
		Student st = dao.getStudentById(id);
		return st;
	}

//	@Override
//	public List<Student> getStudentByName(String name) {
//		return dao.getStudentByName(name);
//	}

	@Override
	public List<Student> getAllStudents() {
		return dao.getAllStudents();
	}

	@Override
	public List<Student> getStudentByName(String name) {
		return dao.getStudentByName(name);
	}

}
