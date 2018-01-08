package table.oldman;

import java.sql.*;
import database.DatabaseConnection;

public class OldmanHandle {	
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public String maxOldmanId() {
		
		String sql = "select OMid from oldman order by OMid desc";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) return rs.getString("OMid");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	public boolean save(Oldman oldman) {
		boolean result = false;
		
		String OMid = oldman.getOMid();
		String OMname = oldman.getOMname();
		String OMsex = oldman.getOMsex();
		String OMidNum = oldman.getOMidNum();
		String OMhome = oldman.getOMhome();
		String OMaddr = oldman.getOMaddr();
		String OMtel1 = oldman.getOMtel1();
		String OMtel2 = oldman.getOMtel2();
		String OMsort = oldman.getOMsort();
		
		String sql = "INSERT INTO oldman VALUES ";
		sql += "('"+ OMid +"', '"+ OMname +"', '"+ OMsex +"', '"+ OMidNum +"', '"+ OMhome
				+"', '"+ OMaddr +"', '"+ OMtel1 +"', '"+ OMtel2 +"', '"+ OMsort +"')";
		
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
			}catch(SQLException e) {}
		}
		return result;
	}
	
	public Oldman searchOldmanByOMid(String OMid) {
		
		Oldman oldman;
		String sql = "SELECT * FROM oldman WHERE OMid='" + OMid + "'";
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				oldman = new Oldman();
				oldman.setOMid(OMid);
				oldman.setOMname(rs.getString("OMname"));
				oldman.setOMidNum(rs.getString("OMidNum"));
				oldman.setOMsex(rs.getString("OMsex"));
				oldman.setOMhome(rs.getString("OMhome"));
				oldman.setOMaddr(rs.getString("OMaddr"));
				oldman.setOMtel1(rs.getString("OMtel1"));
				oldman.setOMtel2(rs.getString("OMtel2"));
				oldman.setOMsort(rs.getString("OMsort"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			oldman = null;
		}
		
		return oldman;
	}
}
