package jdbcDemo.service;

import jdbcDemo.dto.Staff;

public interface StaffService {
	
	Staff getStaffById(int staff_code);
	void deleteStaffById(int staff_code);
	void addStaff(Staff staff);
}
