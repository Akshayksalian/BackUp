package arrays;

public class Employe {

	int empId;
	String name;
	String dept;
	Employe(int empId,String name,String dept){
		this.empId = empId;
		this.name = name;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
