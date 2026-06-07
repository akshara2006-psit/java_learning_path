package com.akshara.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertDemo {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Akshara@2006");
//	System.out.println("Success");
//	PreparedStatement ps=con.prepareStatement("insert into register values('Akshara','Akshara15@gmail.com','Akshu123','Female','Unnao')");
//	String nam1="Amit";
//	String email1="Amil14@gmail.com";
//	String pass1="Amit145";
//	String gender1="Male";
//	String city1="Mumbai";
//	PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
//	ps.setString(1, nam1);
//	ps.setString(2, email1);
//	ps.setString(3, pass1);
//	ps.setString(4, gender1);
//	ps.setString(5, city1);
//	-----Update----
//	PreparedStatement ps=con.prepareStatement("Update register set city=? where name='Akshara'");
//	String city1="Kanpur";
//	ps.setString(1, city1);
	//-----------Delete----------
//	PreparedStatement ps=con.prepareStatement("delete from register where name='Amit'");
	
	//----------------RETRIEVE DATA----------------
	PreparedStatement ps=con.prepareStatement("select * from register");
	
//	int i=ps.executeUpdate();
	ResultSet rs=ps.executeQuery();
	while(rs.next()) {
		String name1=rs.getString("name");
		String email1=rs.getString("email");
		String pass1=rs.getString("password");
		String gender1=rs.getString("gender");
		String city1=rs.getString("city");
		System.out.println(name1+" "+email1+" "+pass1+" "+gender1+" "+city1);
	}
//	if(i>0) {
//		System.out.println("Success");
//	}
//	else {
//		System.out.println("Failed");
//	}
	con.close();
	ps.close();
	
}
}
 