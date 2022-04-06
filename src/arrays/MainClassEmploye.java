package arrays;

public class MainClassEmploye {

	public static void main(String[] args) {
		
		Employe[] empArr = new Employe[3];
		
		Employe emp1 = new Employe(1,"Akshay","Founder");
		Employe emp2 = new Employe(2,"Abhi","Ceo");
		Employe emp3 = new Employe(3,"chandan","Cfo");

		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3;
		
		for(Employe x : empArr) {
			System.out.println(x.getEmpId()+" "+x.getName()+" "+x.getDept());
		}
		
		System.out.println("------------------one more way to initialize object array -------------------");
		
		Employe[] arrEmploye = { new Employe(1,"Akash","HR"),new Employe(2,"setu","BR")};
		
		for(Employe y : arrEmploye) {
			System.out.println(y.getEmpId()+" "+y.getName()+" "+y.getDept());
		}
		
		System.out.println("-------------------another method to print object array");
		
		for(int i=0;i<arrEmploye.length;i++) {
			Employe emp = arrEmploye[i];
			System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getDept());
		}
		
	}

}
