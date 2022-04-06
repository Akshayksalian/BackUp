package jdbcDemo.presentation;

import java.time.LocalDate;

import jdbcDemo.dto.Staff;
import jdbcDemo.service.StaffService;
import jdbcDemo.service.StaffServiceImpl;

public class StaffMain {

	public static void main(String[] args) {
		
		StaffService ss = new StaffServiceImpl();
//		System.out.println(ss.getStaffById(2));
//		ss.deleteStaffById(13);
		
		Staff staff = new Staff();
		
		staff.setStaffName("Tarun");
		staff.setDesignationCode(1);
		staff.setDepartmentCode(2);
		staff.setHireDate(LocalDate.of(2014,07,01));
		staff.setDob(LocalDate.of(2002,05,14));
		staff.setManagerCode(1);
		staff.setSalary(45235.15);
		
		ss.addStaff(staff);
	}

}
