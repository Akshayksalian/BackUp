package collectionFramework.list;
import java.util.*;
public class ScholarShipEligibilityMain {

	public static void main(String[] args) {
		
		List<ClassStudentForScholarship> arrList = new ArrayList<>();
		
		ClassStudentForScholarship s1 = new ClassStudentForScholarship("Akshay",'A',580);
		arrList.add(s1);
		ClassStudentForScholarship s2 = new ClassStudentForScholarship("Chandan",'C',74);
		arrList.add(s2);
		ClassStudentForScholarship s3 = new ClassStudentForScholarship("Manoj",'D',5);
		arrList.add(s3);
		
		List<ClassStudentForScholarship> eligible = new ArrayList<>();
		List<ClassStudentForScholarship> notEligible = new ArrayList<>();
		
		System.out.println("\n-----------List of Students Applying for  Scholarship-----------\n");
		for(ClassStudentForScholarship x : arrList) {
			System.out.println(x);
		}
		
		for(int i=0;i<arrList.size();i++) {
			if(arrList.get(i).getTotalMaarks()>80) {
				eligible.add(arrList.get(i));
			} else {
				notEligible.add(arrList.get(i));
			}
		}
		
		System.out.println("\n\n-----------Eligible for Scholarship-------------\n");
		for(ClassStudentForScholarship x : eligible) {
			System.out.println(x);
		}
		
		System.out.println("\n\n----------Not Eligible for Scholarship-------------\n");
		for(ClassStudentForScholarship x : notEligible) {
			System.out.println(x);
		}
	}

}
