package oops.encapsulation;

public class EmployeeInsurance {
	private int empId;
	private String name;
	private String designation;
	private double salary;
	private String insurance;
	private static int empStatid;
	
	EmployeeInsurance(String name,String designation,double salary){
		this.empId = ++EmployeeInsurance.empStatid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.insurance = insuranceChecking();
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// data hiding has been done here.
	private String insuranceChecking() {
		if(getSalary()>=40000 && getDesignation()=="Manager") {
			return "IA";
		} else if (getSalary()<40000 && getSalary()>=20000 && getDesignation()=="Programmer") {
			return "IB";
		} else if (getSalary()<20000 && getSalary()>=5000 && getDesignation()=="Associate") {
			return "IC";
		} else if (getSalary()<5000 && getDesignation()=="Housekeeper") {
			return "NA";
		} else {
			return "Input Incorrect";
		}
	}

	public void display() {
		System.out.println("Employee Id : "+getEmpId()+" \t Name : "+getName()+"    \t Designation : "+getDesignation()+"   \t Salary : "+getSalary()+""
				+ " \t Insurance Type : "+getInsurance());
	}
	
	

}
