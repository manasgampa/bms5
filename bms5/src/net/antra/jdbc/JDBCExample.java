package net.antra.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		Driver d=new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);*/
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
	try {
		
		//Class.forName("com.mysql.jdbc.Driver"); 
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter the search value");
		int no=sc.nextInt();
		String name=sc.next();
		int sal=sc.nextInt();*/
	//	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "manas");
		con.setAutoCommit(false);
		CallableStatement cstmt=con.prepareCall("{call myproc}");
		cstmt.execute();
		/*PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1, 8);
		pstmt.setString(2, "abc");
		pstmt.setInt(3, 454);
		pstmt.execute();
		
		pstmt.setInt(1, 9);
		pstmt.setString(2, "def");
		pstmt.setInt(3, 536);
		pstmt.execute();
		
		pstmt.setInt(1, 4);
		pstmt.setString(2, "ghi");
		pstmt.setInt(3, 6456);
		
		
		
		pstmt.execute();
		*/
		con.commit();
	}catch(Exception e) {
		e.printStackTrace();
			con.rollback();
			}
			con.close();
		}
		//Statement stmt=con.createStatement();
		
	//	ResultSet rs=stmt.executeQuery("select * from employee where empid="+no);
		
		//stmt.executeUpdate("insert into employee values("+no+","+"'"+name+"'"+","+sal+")");
		/*while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			
			
		}*/
		
	}

