package jdbcDemo.dao;

import java.sql.SQLException;

import jdbcDemo.dto.Staff;

public interface StaffDao {

	Staff getStaffById(int staffCode) throws SQLException;
	void deleteStaffById(int staffCode) throws SQLException;
	void addStaff(Staff staff) throws SQLException;
	
}
