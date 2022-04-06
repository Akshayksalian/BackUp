package jdbcLearnings;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import jdbcDemo.dto.Staff;

public class PreparedStatementDemo {

	public static void main(String[] args) { // CRUD : Insert Select Update Delete
		
//		insertData("asawsf",1,2,LocalDate.of(2014,07,01),LocalDate.of(2002,05,14),1,45235.15);
//		readData(1);
//		updateData(staff_code,salary,manager_code)
//		updateData(11,500.24,2);
//		deleteData(11);

	}
	
	private static void insertData(String staffName,int designationCode,int departmentCode,LocalDate hireDate,
			LocalDate dob,int managerCode,double Salary) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","akshay@4458");){
			
			String insertQuery = "Insert into staff_master (staff_name,staff_designation_code,staff_department_code,hire_date,"
					+ "staff_dob,manager_code,staff_sal) values (?,?,?,?,?,?,?)";
			
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setString(1,staffName);
			ps.setInt(2,designationCode);
			ps.setInt(3,departmentCode);
			ps.setDate(4,Date.valueOf(hireDate));
			ps.setDate(5,Date.valueOf(dob));
			ps.setInt(6,managerCode);
			ps.setDouble(7,Salary);
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Insertion Successfully");
			} else {
				throw new SQLException("Problem in Insertion.");
			}
			
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		}
	}
	
	private static void readData(int staffCode) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","akshay@4458");){
			
			String selectQuery = "Select * from staff_master where staff_code=?";
			
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setInt(1,staffCode);
			
			String str="";
			ResultSet rset = ps.executeQuery();
			while(rset.next()) {
				
				Staff stf = new Staff(rset.getInt("staff_code"),
						rset.getString("staff_name"), 					//rset.getString(1),
						rset.getInt("staff_designation_code"),
						rset.getInt("staff_department_code"),
						rset.getDate("hire_date").toLocalDate(),
						rset.getDate("staff_dob").toLocalDate(),
						rset.getInt("manager_code"),
						rset.getDouble("staff_sal"));
				
				System.out.println(stf);
			}
			
			System.out.println(str);
			
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		
	}
	
	
	/*
	 *Update
	 * Updating salary and managerCode
	 * using staff code
	 */
	private static void updateData(int staffCode,double salary,int managerCode) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","akshay@4458");){
			
			String updateQuery = "Update staff_master set staff_sal=?,manager_code=? where staff_code=?";
			
			PreparedStatement ps = con.prepareStatement(updateQuery);
			ps.setDouble(1,salary);
			ps.setInt(2, managerCode);
			ps.setInt(3,staffCode);
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Update Successfull");
			} else {
				throw new SQLException("Problem in Updation.");
			}
			
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		
	}

	private static void deleteData(int staffCode) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema","root","akshay@4458");){
			
			String deleteQuery = "Delete from staff_master where staff_code = ?";
			
			PreparedStatement ps = con.prepareStatement(deleteQuery);
			ps.setInt(1,staffCode);
			
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Delete Successfull");
			} else {
				throw new SQLException("Problem in Deletion.");
			}
			
		} catch(SQLException s) {
			System.out.println(s.getMessage());
		}
		
	}
}
