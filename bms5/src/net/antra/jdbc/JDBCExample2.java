package net.antra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample2 {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "sa");
		System.out.println(con);
	}
}
