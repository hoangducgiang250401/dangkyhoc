package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.MysqlConnection;
import model.AllRegisted;
import model.Registed;

public class DAOgetRegisted {
	
	public static List<Registed> getRegisted(String id) {
		List<Registed> list = new ArrayList<Registed>();
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rs = null;

		String query = "select * from registed where id_sd = ?;";

		try {

			pStatement = connection.prepareStatement(query);
			pStatement.setString(1, id);
			rs = pStatement.executeQuery();

			while (rs.next()) {
				list.add(new Registed(rs.getInt(2),rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7),
						rs.getInt(8), rs.getString(9), rs.getString(10)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public static List<AllRegisted> getAll() {
		List<AllRegisted> list = new ArrayList<AllRegisted>();
		Connection connection = MysqlConnection.getConnection();
		PreparedStatement pStatement = null;
		ResultSet rs = null;

		String query = "select * from registed order by registed.id_sj;";

		try {

			pStatement = connection.prepareStatement(query);
			rs = pStatement.executeQuery();

			while (rs.next()) {
				list.add(new AllRegisted(rs.getInt(1), rs.getInt(2),rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7),
						rs.getInt(8), rs.getString(9), rs.getString(10)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public static void main(String[] args) {
		List<AllRegisted> list = DAOgetRegisted.getAll();
		for(AllRegisted allregisted : list) {
			System.out.println(allregisted.toString());
		}
	}
}
