package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.MysqlConnection;

public class DAOdeleteRegisted {
	
	public static void deleteRegisted(String id) throws SQLException {
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement preparedStatement = null;
		String query = "delete from register where id_sd = ?;";
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, id);
		preparedStatement.executeUpdate();
	}
	
	public static void main(String[] args) {
		try {
			DAOdeleteRegisted.deleteRegisted("19020270");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
