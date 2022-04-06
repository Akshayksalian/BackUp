package jdbcLearnings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {

	public static void main(String[] args) {

		try {
			/*
			 * Loading or registering a diver. it can be done in two ways from java 8 it
			 * will load automatically no need to load.
			 */
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschema", "root", "akshay@4458");

			// Creating a statement
			Statement st = con.createStatement();

			int count = st
					.executeUpdate("Insert into staff_master (staff_name,staff_designation_code,staff_department_code,"
							+ "hire_date,staff_dob,manager_code,staff_sal)"
							+ "values ('Rohan',4,3,'2018-05-20','2000-06-12',1,48000)");

			if (count == 1) {
				System.out.println("Record is inserted successfully " + count);
			} else {
				System.out.println("failed to insert");
			}
			con.close();
		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}
	}

}
