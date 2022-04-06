package assesment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

			Scanner s = new Scanner(System.in);

			String fn = s.nextLine();
			String ln = s.nextLine();
			int age = Integer.parseInt(s.nextLine());
			int salary = Integer.parseInt(s.nextLine());
			
			s.close();
			
			addEmployee(fn, ln, age, salary);
		
	}
	
	public static void addEmployee(String fn,String ln,int age,int salary) {
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschemageneral", "root","akshay@4458");){
		
		String insertQuery = "Insert into employee (first_name,last_name,age,salary) values (?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setString(1, fn);
		ps.setString(2, ln);
		ps.setInt(3, age);
		ps.setInt(4, salary);

		int count = ps.executeUpdate();
		if (count > 0) {
			System.out.println("Insertion Successfully");
		} else {
			throw new SQLException("Problem in Insertion.");
		}

	} catch (SQLException s) {
		System.out.println(s.getMessage());
	}
		
	}
}
