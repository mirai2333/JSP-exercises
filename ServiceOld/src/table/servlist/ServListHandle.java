package table.servlist;

import java.sql.*;

import database.DatabaseConnection;

public class ServListHandle {
	//连接数据库的常用类。
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	//将servlist表按编号从大到小查询
	public String MaxServListId() {
		String result = null;
		String sql = "select SLid from servlist order by SLid desc";
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) result = rs.getString("SLid");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
