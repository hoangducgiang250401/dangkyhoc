package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MysqlConnection;
import model.Registed;

public class DAOinsertRegister {

	public static void insertRegister(String id, List<Registed> list) throws SQLException {
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement preparedStatement = null;
		String query_delete = "insert into register values (?,?);";
		for (Registed r : list) {
			preparedStatement = connection.prepareStatement(query_delete);
			preparedStatement.setString(1, id);
			preparedStatement.setInt(2, r.getId_sj());
			preparedStatement.executeUpdate();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		Registed a = new Registed(4, null, 0, null, null, null, 0, null, null);
		Registed b = new Registed(5, null, 0, null, null, null, 0, null, null);
		Registed c = new Registed(6, null, 0, null, null, null, 0, null, null);
		List<Registed> list = new ArrayList<Registed>();
		list.add(a);
		list.add(b);
		list.add(c);
		DAOinsertRegister.insertRegister("19020260", list);
	}
}
