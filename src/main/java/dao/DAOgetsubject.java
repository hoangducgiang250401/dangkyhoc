package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MysqlConnection;
import model.Subject;

public class DAOgetsubject {
	public static List<Subject> get_listSJ() {
		List<Subject> danh_sach_sp = new ArrayList<>();
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		String query  = "select  * from monhoc;";
		
		try {
			
			pStatement  = connection.prepareStatement(query);
			rs = pStatement.executeQuery();
			
			while(rs.next()) {
				danh_sach_sp.add(new Subject(rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						""
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return danh_sach_sp;
	}
	
	public static void main(String[] args) {
		List<Subject> list = DAOgetsubject.get_listSJ();
		for(Subject mon : list) {
			System.out.println(mon.toString());
		}
	}
}
