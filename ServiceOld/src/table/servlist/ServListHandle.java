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
	
	public ServList searchServListById(String SLid) {
		ServList servlist = null;
		String sql = "select * from servlist where SLid="+SLid;
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				servlist = getServlistFromResultSet(rs);
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
		}
		
		return servlist;
	}
	
	public boolean modifyServListMessage(ServList s) {
		boolean result = false;
		String sql = "update servlist set SRname='"+s.getSRname()+"', SLstartTime='"+s.getSLstartTime()+
				"', SLcloseTime='"+s.getSLcloseTime()+"', OMname='"+s.getOMname()+"', SLcontent='"
				+s.getSLcontent()+"', SLfee='"+s.getSLfee()+"', SLfeeOk='"+s.getSLfeeOk()+
				"', SLlevel='"+s.getSLlevel()+"' where SLid='"+s.getSLid()+"'";
		
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

	public ServList getServlistFromResultSet(ResultSet rs) {
		ServList servlist = new ServList();
		try {
			servlist.setSLid(rs.getString("SLid"));
			servlist.setSRname(rs.getString("SRname"));
			servlist.setOMname(rs.getString("OMname"));
			servlist.setSLstartTime(rs.getString("SLstartTime"));
			servlist.setSLcloseTime(rs.getString("SLcloseTime"));
			servlist.setSLcontent(rs.getString("SLcontent"));
			servlist.setSLfee(rs.getString("SLfee"));
			servlist.setSLfeeOk(rs.getString("SLfeeOk"));
			servlist.setSLlevel(rs.getString("SLlevel"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return servlist;
	}
	
	public ServList[] queryByConditions(String where) {
		ServList[] servlists = null;
		int rows = 0;
		String sql = "select * from servlist where "+where;
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.last()) {
				rows = rs.getRow();
				servlists = new ServList[rows];
				rs.beforeFirst();
				int i = 0;
				while(rs.next()) {servlists[i++] = getServlistFromResultSet(rs);}
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
		}
		return servlists;
	}
	
}
