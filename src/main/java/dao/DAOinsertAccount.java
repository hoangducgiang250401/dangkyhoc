package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.MysqlConnection;
import model.Accounts;

public class DAOinsertAccount {
	
	public static void insertAccount(Accounts accounts) throws SQLException {
		
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		
		String query = "insert into accounts values (? ,? ,? ,? );";
		
		pStatement = connection.prepareStatement(query);
			
		pStatement.setString(1, accounts.getUsername());
		pStatement.setString(2, accounts.getPass());
		pStatement.setInt(3, accounts.getId_sd());
		pStatement.setInt(4, accounts.getIsadmin());
			
		pStatement.executeUpdate();
	}
	public static void main(String[] args) {
		Accounts giang = new Accounts("20000005@vnu.edu.vn", "123", 20000005, 0);
		try {
			DAOinsertAccount.insertAccount(giang);
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
