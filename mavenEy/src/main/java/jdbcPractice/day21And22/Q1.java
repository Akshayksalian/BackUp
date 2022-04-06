package jdbcPractice.day21And22;

import java.sql.*;
import java.util.*;

public class Q1 {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_account", "root",
				"akshay@4458");) {
			Scanner s = new Scanner(System.in);

			int n = s.nextInt();

			while (n != 0) {
				int id = s.nextInt();
				String name = s.next();
				int avg = s.nextInt();

				Student stud = new Student(id, name, avg);

				insertData(s, con, stud);
				readData(con, stud);
				n -= 1;
			}
			
		} catch (SQLException sq) {
			System.out.println(sq.getMessage());
		}

	}

	private static void insertData(Scanner s, Connection con, Student stud) throws SQLException {

		String insertQuery = "Insert into student (id,st_name,average_marks) values (?,?,?)";

		PreparedStatement ps = con.prepareStatement(insertQuery);
		ps.setInt(1, stud.getId());
		ps.setString(2, stud.getName());
		ps.setInt(3, stud.getAge());

		int count = ps.executeUpdate();
		if (count == 0) {
			throw new SQLException("Problem in Insertion.");
		}

	}

	private static void readData(Connection con, Student stud) throws SQLException {

		String selectQuery = "Select * from student where id=?";

		PreparedStatement ps = con.prepareStatement(selectQuery);
		ps.setInt(1, stud.getId());

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(stud);
		}

	}
}

class Student {

	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return id + " " + name + " " + age;
	}

}