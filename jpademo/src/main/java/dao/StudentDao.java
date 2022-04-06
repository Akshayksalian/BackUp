package dao;

import java.util.List;

import entities.Student;

public interface StudentDao {
	
	Student getStudentById(int id);
	
	void addStudent(Student student);
	
	void removeStudent(Student student);
	
	void updateStudent(Student student);
	
	void beginTransaction();
	
	void commitTransaction();
	
//	List<Student> getStudentByName(String name);
	
	List<Student> getStudentByName(String name);
	
	List<Student> getAllStudents();
}
