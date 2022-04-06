package assesment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {

	public Student getStudentByRollNo(int rollNo) {
		
		Student s = null;
		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myschemageneral","root","akshay@4458");){
			
			String selectQuery = "Select * from student where rollno=?";
			
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setInt(1,rollNo);
			
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				 s = new Student();
					s.setRollNo(rs.getInt(1));
					s.setStudentName(rs.getString(2));
					s.setMark1(rs.getInt(3));
					s.setMark2(rs.getInt(4));
					s.setMark3(rs.getInt(5));
		
			}
			
			
		} catch(SQLException sq) {
			System.out.println(sq.getMessage());
		}
		return s;
		
	}
}
