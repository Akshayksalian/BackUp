package testScan.dto;

public class Employee {
	
	private int emptId;
	private String empName;
	private String dept;
	
	public Employee() {
		
	}

	public Employee(int emptId, String empName, String dept) {
		this.emptId = emptId;
		this.empName = empName;
		this.dept = dept;
	}
	
	public int getEmptId() {
		return emptId;
	}
	public void setEmptId(int emptId) {
		this.emptId = emptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "[emptId=" + emptId + ", empName=" + empName + ", dept=" + dept + "]";
	}
	
	
	

}
