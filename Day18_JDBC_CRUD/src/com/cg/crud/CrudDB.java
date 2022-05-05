package com.cg.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
public class CrudDB {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://127.0.0.1:3306/CG";
		String username="root";
		String password="PratuRathod@3";
	try
	{
		Connection con = DriverManager.getConnection(dbURL, username, password);
		String sql = "SELECT * FROM Employee22";
		Statement st = con.createStatement();
		ResultSet r = st.executeQuery(sql);
		int count = 1;
		while(r.next())
		{
			String name = r.getString(2);
			String password1 = r.getString(3);
			String email = r.getString(4);
			String result = "USER: %d %s %s %s";
			System.out.println(String.format(result, count++,name,password1,email));
		}
		con.close();
		/*String sql = "INSERT INTO Employee22(user_name,password,email)VALUES(?,?,?)";
		PreparedStatement s = con.prepareStatement(sql);
		s.setInt(0, 123);
		s.setString(1,"Hrithik_j12");
		s.setString(2,"Pass@123");
		s.setString(3,"Hrithik@gmail.com");
		int rows = s.executeUpdate();
		if(rows>0)
		{
			System.out.println("A new User Information entered successfully");
		}
		con.close();*/
		
	}	
    catch(SQLException e)
	{
    	System.out.println("Exception Occurred"+e);
	}
}
}
