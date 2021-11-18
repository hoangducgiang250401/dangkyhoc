package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.MysqlConnection;
import model.Asubject;

public class DAOinsertSubject {
	
	public static void insertSubject(Asubject asubject) throws SQLException {
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		String query = "insert into subjects values (?,?,?,?,?,?,?,?,?);";
		
		pStatement = connection.prepareStatement(query);
		pStatement.setInt(1, asubject.getId_sj());
		pStatement.setString(2, asubject.getSubjectname());
		pStatement.setString(3, asubject.getClassname());
		pStatement.setInt(4, asubject.getMaxsd());
		pStatement.setString(5, asubject.getRoom());
		pStatement.setInt(6, asubject.getThu());
		pStatement.setString(7, asubject.getPeriod());
		pStatement.setInt(8, asubject.getCredis());
		pStatement.setInt(9, asubject.getId_lt());
		pStatement.executeUpdate();
	}
	public static void main(String[] args) {
		Asubject a = new Asubject(40,"phát triển ứng dụng web", 3, "int 33016",80,5,"9-10","pm-201",4);
		try {
			DAOinsertSubject.insertSubject(a);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
