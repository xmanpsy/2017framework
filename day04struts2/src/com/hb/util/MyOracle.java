package com.hb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;

public class MyOracle {
	private static Connection conn;
	
	private MyOracle() {
		
	}
	
	public static Connection getConnection(){
		try {
			if(conn==null||conn.isClosed())
				Class.forName("org.h2.Driver");
				conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
