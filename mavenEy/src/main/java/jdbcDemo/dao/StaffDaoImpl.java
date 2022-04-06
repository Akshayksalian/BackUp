package jdbcDemo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcDemo.dto.Staff;

public class StaffDaoImpl implements StaffDao{

	@Override
	public Staff getStaffById(int staffCode) throws SQLException {
		Staff stf = null;
		String sqlQuery = "Select * from staff_master where staff_code = ?";
		
		try(Connection connection = DBUtil.getDataSource().getConnection()){
			PreparedStatement ps = connection.prepareStatement(sqlQuery);
			ps.setInt(1,staffCode);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				stf = new Staff(rs.getInt("staff_code"),
						rs.getString("staff_name"), 				
						rs.getInt("staff_designation_code"),
						rs.getInt("staff_department_code"),
						rs.getDate("hire_date").toLocalDate(),
						rs.getDate("staff_dob").toLocalDate(),
						rs.getInt("manager_code"),
						rs.getDouble("staff_sal"));
				
			}
			
		}
		
		return stf;
	}

	@Override
	public void deleteStaffById(int staffCode) throws SQLException {
		
		String deleteQuery = "Delete from staff_master where staff_code=?";
		
		try(Connection connection = DBUtil.getDataSource().getConnection()){
			
			PreparedStatement ps = connection.prepareStatement(deleteQuery);
			ps.setInt(1,staffCode);
			
			int count = ps.executeUpdate();
			
			if(count>0) {
				System.out.println("Deleted Successfully");
			} else {
				throw new SQLException("Failed to delete");
			}
			
		}

	}

	@Override
	public void addStaff(Staff staff) throws SQLException {
		
		String insertQuery = "Insert into staff_master (staff_name,staff_designation_code,staff_department_code,hire_date,"
				+ "staff_dob,manager_code,staff_sal) values (?,?,?,?,?,?,?)";
		
		try(Connection connection = DBUtil.getDataSource().getConnection()){
			
			PreparedStatement ps = connection.prepareStatement(insertQuery);
			
			ps.setString(1,staff.getStaffName());
			ps.setInt(2,staff.getDesignationCode());
			ps.setInt(3,staff.getDepartmentCode());
			ps.setDate(4,Date.valueOf(staff.getHireDate()));
			ps.setDate(5,Date.valueOf(staff.getDob()));
			ps.setInt(6,staff.getManagerCode());
			ps.setDouble(7,staff.getSalary());
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Insertion Successfully");
			} else {
				throw new SQLException("Problem in Insertion.");
			}
			
		}
		
	}

}
