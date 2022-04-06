package jdbcLearnings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbcDemo.dto.Staff;

public class select {

	public static void main(String[] args) {
		
		List<Staff> staffList = getStaff();
		
		for(Staff x : staffList) {
			System.out.println(x);
		}
	}
	
	private static List<Staff> getStaff(){
		
		List<Staff> staffList = new ArrayList<>();
		
//		String selectQueries = "Select staff_code,\r\n "
//				+ "staff_name,\r\n staff_designation_code,\r\n staff_department_code,\r\n hire_date,\r\n "
//				+ "staff_dob,\r\n manager_code,\r\n staff_sal \r\n from staff_master";
		
		String selectQueries = "Select staff_code,"
				+ "staff_name,staff_designation_code,staff_department_code,hire_date,"
				+ "staff_dob,manager_code,staff_sal from staff_master";
		
		// try with resources will closes connection automatically
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","akshay@4458");){
			
			Statement st = con.createStatement();
			
			ResultSet rset = st.executeQuery(selectQueries);
			
			while(rset.next()) {
				Staff stf = new Staff(rset.getInt("staff_code"),
						rset.getString("staff_name"), 					//rset.getString(1),
						rset.getInt("staff_designation_code"),
						rset.getInt("staff_department_code"),
						rset.getDate("hire_date").toLocalDate(),
						rset.getDate("staff_dob").toLocalDate(),
						rset.getInt("manager_code"),
						rset.getDouble("staff_sal"));
				
				staffList.add(stf);
			}
			
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		} 
		
		return staffList;
	}

}
