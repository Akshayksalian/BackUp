package jdbcDemo.service;

import java.sql.SQLException;

import jdbcDemo.dao.StaffDao;
import jdbcDemo.dao.StaffDaoImpl;
import jdbcDemo.dto.Staff;

public class StaffServiceImpl implements StaffService{

	private StaffDao staffDao;
	
	public StaffServiceImpl(){
		
		staffDao = new StaffDaoImpl();
	}
	
	@Override
	public Staff getStaffById(int staff_code) {
		try {
			return staffDao.getStaffById(staff_code);
		} catch(SQLException s) {
			throw new RuntimeException();
		}
		
	}

	@Override
	public void deleteStaffById(int staff_code) {
		try {
			 staffDao.deleteStaffById(staff_code);
		} catch(SQLException s) {
			throw new RuntimeException();
		}
	}

	@Override
	public void addStaff(Staff staff) {
		try {
			 staffDao.addStaff(staff);
		} catch(SQLException s) {
			throw new RuntimeException();
		}
	}

}
