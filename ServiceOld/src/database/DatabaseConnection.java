package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("找不到驱动类，加载驱动失败");
			e.printStackTrace();
		}
			String url = "jdbc:mysql://localhost:3306/serviceold";
			try {
				conn=DriverManager.getConnection(url, "root", "y973593589");
			}catch(SQLException e) {
				System.out.println("数据库连接失败！");
				e.printStackTrace();
			}
		return conn;
	}
}
