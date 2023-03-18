package co.edu.poli.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con = null;

	static {
		String url = "jdbc:mysql://127.0.0.1:3306/Singleton";
		String user = "root";
		String pass = "123";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Conexion oks");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
