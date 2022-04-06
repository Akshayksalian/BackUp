package jdbcLearnings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TransactionDemo {

	public static void main(String[] args) {

		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_account","root","akshay@4458");
			connection.setAutoCommit(false);
			
			int fromAccount = 2;
			int toAccount = 5;
			int ammount = 500;
			
			withdrawAmount(connection,fromAccount,ammount);
			depositAmount(connection,toAccount,ammount);
			
			System.out.println("Transfer successfull !!");
			
			connection.commit();
			
		} catch(SQLException s) {
			System.out.println(s.getMessage());
			
			if(connection!=null) {
				try {
					connection.rollback();
					System.out.println("Found some issue so rolling back the transaction.");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	private static void withdrawAmount(Connection connection,int accountNum,int amount) throws SQLException {
		
		String query = "Update sbi_account set balance = balance-? where account_num=?";
		PreparedStatement ps = null;
			
		try {
			ps=connection.prepareStatement(query);
			ps.setInt(1,amount);
			ps.setInt(2,accountNum);
			
			if(ps.executeUpdate()==0) {
				throw new SQLException("Account number not found");
			}
		} finally {
			if(ps!=null)
				ps.close();
		}
		
	}
	
private static void depositAmount(Connection connection,int accountNum,int amount) throws SQLException {
		
		String query = "Update sbi_account set balance = balance+? where account_num=?";
		PreparedStatement ps = null;
			
		try {
			ps=connection.prepareStatement(query);
			ps.setInt(1,amount);
			ps.setInt(2,accountNum);
			
			if(ps.executeUpdate()==0) {
				throw new SQLException("Account number not found");
			}
		} finally {
			if(ps!=null)
				ps.close();
		}
		
	}
}
