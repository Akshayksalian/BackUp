package service;

import java.util.List;

import entities.Student;

public interface StudentService {
	
	void addStudent(Student student);
	
	void updateStudent(Student student);
	
	void removeStudent(Student student);
	
	Student findStudentById(int id);
	
//	List<Student> getStudentByName(String name);
	
	List<Student> getAllStudents();
	
	List<Student> getStudentByName(String name);
	
}
