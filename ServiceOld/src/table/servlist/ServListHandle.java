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
	
	//将传入的servlist写入数据库
	public boolean save(ServList s) {
		
		boolean result = false;
		
		String sql = "insert into servlist values ";
		sql += "('"+s.getSLid()+"','"+s.getSRname()+"','"+s.getSLstartTime()+"','"+s.getSLcloseTime()
			+"','"+s.getOMname()+"','"+s.getSLcontent()+"','"+s.getSLfee()+"','"+s.getSLfeeOk()
			+"','"+s.getSLlevel()+"')";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			result = true;
		}catch(SQLException e){
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
