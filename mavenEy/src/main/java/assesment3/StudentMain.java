package assesment3;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		StudentDao sd = new StudentDao();
		
		int n = s.nextInt();
		
		s.close();
		
		Student st = sd.getStudentByRollNo(n);
		
		System.out.println(st);
		
	}

}
