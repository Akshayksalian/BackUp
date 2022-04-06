package jdbcDemo.dto;

import java.time.LocalDate;

public class Staff {

	private int staffId;
	private String staffName;
	private int designationCode;
	private int departmentCode;
	private LocalDate hireDate;
	private LocalDate dob;
	private int managerCode;
	private double salary;
	
	public Staff(int staffId, String staffName, int designationCode, int departmentCode, LocalDate hireDate,
			LocalDate dob, int managerCode, double salary) {
		this.staffId = staffId;
		this.staffName = staffName;
		this.designationCode = designationCode;
		this.departmentCode = departmentCode;
		this.hireDate = hireDate;
		this.dob = dob;
		this.managerCode = managerCode;
		this.salary = salary;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public int getDesignationCode() {
		return designationCode;
	}

	public void setDesignationCode(int designationCode) {
		this.designationCode = designationCode;
	}

	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(int managerCode) {
		this.managerCode = managerCode;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[staffId : " + staffId + ", staffName : " + staffName + ", designationCode : " + designationCode
				+ ", departmentCode : " + departmentCode + ", hireDate : " + hireDate + ", dob : " + dob + ", managerCode : "
				+ managerCode + ", salary : " + salary + "]";
	}
	
	
	
	
	
}
