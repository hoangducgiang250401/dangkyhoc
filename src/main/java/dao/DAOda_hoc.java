package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MysqlConnection;
import model.Da_hoc;

public class DAOda_hoc {
	public static List<Da_hoc> getdahoc(String id){
		List<Da_hoc> list = new ArrayList<Da_hoc>();
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rs = null;
		
		String query  = "SELECT * FROM dangkyhoc.sbstatus where id_sd = ?;";
		
		try {
			
			pStatement  = connection.prepareStatement(query);
			pStatement.setString(1, id);
			rs = pStatement.executeQuery();
			
			while(rs.next()) {
				list.add(new Da_hoc(rs.getInt(1), 
						rs.getInt(2), 
						rs.getString(3)
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public static void main(String[] args) {
		List<Da_hoc> list = DAOda_hoc.getdahoc("19020270");
		for(Da_hoc o : list) {
			System.out.println(o.toString());
		}
	}
}
