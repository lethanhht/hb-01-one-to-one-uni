package com.lethanh.jdbc;

public class TestJdbc {

	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb-01-one-to-one-uni?useSSL=false&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";

		try {
			System.out.println("Connecting to database: " + jdbcUrl);

//			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
//			
			System.out.println("Connecting successfull!!");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
