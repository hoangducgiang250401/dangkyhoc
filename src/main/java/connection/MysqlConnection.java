package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	
	public static Connection getConnection () {
		
		final String url = "jdbc:mysql://localhost:3307/dangkyhoc";
		final String user = "root";
		final String pass = "250401";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			
			System.out.println("err : connection mysql");
		} catch (SQLException e) {
			
			System.out.println("err : connection mysql");		
		}
		return null;
	}
	
	// test connection
	public static void main(String[] args) {
		
		Connection connection = getConnection();

		if (connection == null) {

			System.out.println("that bai");

		} else {
			System.out.println("thanh cong");
		}
	}
}
