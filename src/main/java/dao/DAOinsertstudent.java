package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.MysqlConnection;
import model.Student;

public class DAOinsertstudent {
	public static void insertStudent(Student student) throws SQLException {
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		
		String query = "insert into students values (?,?,?,?,?,?);";
		
		pStatement = connection.prepareStatement(query);
			
		pStatement.setInt(1, student.getId_sd());
		pStatement.setString(2, student.getFullname());
		pStatement.setString(3, student.getCourse());
		pStatement.setString(4, student.getDateofbirth());
		pStatement.setInt(5, student.getDisadvantaged());
		pStatement.setString(6, student.getBirthplace());
			
		pStatement.executeUpdate();
	}
	
	public static void main(String[] args) {
		Student giang = new Student(20000006, "Hoàng đức giang", "K65-CF", "2002-04-05", 0, "Hưng yên");
		try {
			DAOinsertstudent.insertStudent(giang);
		} catch (SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
}
