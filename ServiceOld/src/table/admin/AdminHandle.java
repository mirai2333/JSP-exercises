package table.admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DatabaseConnection;

public class AdminHandle {
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public boolean CheckAdmin(Admin admin) {
		boolean blnResult = false;
		
		String admName=admin.getAdmName();
		String admPassword=admin.getAdmPassword();
		
		try {
			conn = DatabaseConnection.getConnection();
			stmt = conn.createStatement();
			String str="select * from admin where admName='"+admName+"' and admPassword='"+admPassword+"'";
			rs=stmt.executeQuery(str);
			
			while (rs.next()) {
				blnResult=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return blnResult;
	}

}
