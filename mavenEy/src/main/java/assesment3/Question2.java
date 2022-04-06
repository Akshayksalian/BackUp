package assesment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int salary = s.nextInt();

		s.close();

		deleteEmployee(salary);

	}

	public static void deleteEmployee(int salary) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschemageneral", "root",
				"akshay@4458");) {

			int count=0;
			String deleteQuery = "delete from employee where salary > ?";

			PreparedStatement ps = con.prepareStatement(deleteQuery);
			ps.setInt(1, salary);

			count += ps.executeUpdate();
			if (count > 0) {
				System.out.println("Deleted Successfully");
				System.out.println("Number of rows affected is "+count);
			} else {
				throw new SQLException("Problem in Deletion.");
			}

		} catch (SQLException s) {
			System.out.println(s.getMessage());
		}

	}

}
