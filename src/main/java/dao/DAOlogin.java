package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.MysqlConnection;
import model.Accounts;

public class DAOlogin {
	public static Accounts checkLogin(String user, String pass) {

		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rs = null;

		try {

			String query = "SELECT * FROM dangkyhoc.accounts where username = ?  and pass = ?;";

			pStatement = connection.prepareStatement(query);

			pStatement.setString(1, user);

			pStatement.setString(2, pass);

			rs = pStatement.executeQuery();
			while (rs.next()) {
				Accounts accounts = new Accounts(rs.getString(1), rs.getString(2), (Integer) rs.getInt(3),
						rs.getInt(4));
				return accounts;
			}

		} catch (SQLException e) {

			System.out.println("Error : function checklogin");
		}

		return null;
	}
	public static String getName(String id) {
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet resultSet = null;
		
		String query = "SELECT students.fullname FROM dangkyhoc.students where students.id_sd = ?;";
		
		try {
			pStatement = connection.prepareStatement(query);
			pStatement.setString(1, id);
			resultSet = pStatement.executeQuery();
			
			while(resultSet.next()) {
				return resultSet.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("Error : function getName");
		}
		
		return null;
	}

	public static void main(String[] args) {
		Accounts accounts = DAOlogin.checkLogin("19020270", "123");
		System.out.println(accounts.getPass());
		System.out.println(DAOlogin.getName("19020270"));
	}
}
