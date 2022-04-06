package mainClasses;

import java.util.List;

import entities.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();

//		// Creation
//		Student s = new Student();
//		s.setName("Rohan suraj");
//		service.addStudent(s);

		// Read
//		Student s = service.findStudentById(2);
//		System.out.println("Id : "+s.getStudentId());
//		System.out.println("Name : "+s.getName());

		// Updation
//		Student s = new Student();
//		s.setStudentId(1);
//		s.setName("Ramesh");
//		service.updateStudent(s);

		// Delete
//		Student std = service.findStudentById(1);
//		service.removeStudent(std);

		// paramterized using jpql
//		List<Student> sList = service.getStudentByName("Rohan");
//		for (Student s : sList) {
//			System.out.println("Id: " + s.getStudentId());
//			System.out.println("Name: " + s.getName());
//		}
		
		//Named Query
//		List<Student> stList = service.getAllStudents();
//		for(Student s : stList) {
//			System.out.println("Id: " + s.getStudentId());
//			System.out.println("Name: " + s.getName());	
//		}
		
		List<Student> sList = service.getStudentByName("Rohan");
		for (Student s : sList) {
			System.out.println("Id: " + s.getStudentId());
			System.out.println("Name: " + s.getName());
		}

	}

}
