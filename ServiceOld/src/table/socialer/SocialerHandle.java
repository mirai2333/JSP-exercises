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
		+"','"+s.getSRhome()+"','"+s.getSRaddr()+"','"+s.getSRtel()+"','"+s.getSRsort()
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
	
	public Socialer searchSocialerById(String SRid) {
		Socialer socialer = null;
		String sql = "select * from socialer where SRid='"+SRid+"'";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				socialer = new Socialer();
				socialer.setSRid(SRid);
				socialer.setSRname(rs.getString("SRname"));
				socialer.setSRsex(rs.getString("SRsex"));
				socialer.setSRidNum(rs.getString("SRidNum"));
				socialer.setSRhome(rs.getString("SRhome"));
				socialer.setSRaddr(rs.getString("SRaddr"));
				socialer.setSRsort(rs.getString("SRsort"));
				socialer.setSRtel(rs.getString("SRtel"));
				socialer.setSRstarDate(rs.getString("SRstarDate"));
				socialer.setSRlevel(rs.getString("SRlevel"));
				socialer.setSRsalary(rs.getString("SRsalary"));
			}
		}catch(SQLException e) {e.printStackTrace();}
		finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {e.printStackTrace();}
		}
		return socialer;
	}
	
	public boolean modifySocialerMessage(Socialer s) {
		String sql;
		
		boolean result = false;
		
		sql = "update socialer set SRname='"+s.getSRname()+"', SRsex='"+s.getSRsex()+
				"' ,SRidNum='"+s.getSRidNum()+"' ,SRhome='"+s.getSRhome()+"' ,SRaddr='"+
				s.getSRaddr()+"' ,SRtel='"+s.getSRtel()+"' ,SRsort='"+s.getSRsort()+
				"' ,SRsalary='"+s.getSRsalary()+"' ,SRstarDate='"+s.getSRstarDate()+
				"' ,SRlevel='"+s.getSRlevel()+"' where SRid='"+s.getSRid()+"'";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			result = true;
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
