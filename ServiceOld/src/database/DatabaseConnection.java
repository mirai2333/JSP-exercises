package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/serviceold";
			conn=DriverManager.getConnection(url, "root", "y973593589");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
}
