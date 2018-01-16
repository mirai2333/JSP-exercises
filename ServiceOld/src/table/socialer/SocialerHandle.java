package table.socialer;

import java.sql.*;

import database.DatabaseConnection;

public class SocialerHandle {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public String MaxSocialerId() {
		
		String sql = "select SRid from socialer order by SRid desc";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next())return rs.getString("SRid");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public boolean save(Socialer s) {
		boolean rs = false;
		
		String sql = "insert into socialer values ";
		sql += "('"+s.getSRid()+"','"+s.getSRname()+"','"+s.getSRsex()+"','"+s.getSRidNum()
		+"','"+s.getSRhome()+"','"+s.getSRSRaddr()+"','"+s.getSRtel()+"','"+s.getSRsort()
		+"','"+s.getSRsalary()+"','"+s.getSRstarDate()+"','"+s.getSRlevel()+"')";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			rs = true;
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
		
		return rs;
	}
}
