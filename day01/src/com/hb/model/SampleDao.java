package com.hb.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class SampleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public SampleDao() throws ClassNotFoundException, SQLException {
		Connection myconn=null;
		Class.forName("org.h2.Driver");
		DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		conn=myconn;
	}
	
	public List<Map<String,Object>> selectAll() throws SQLException{
		String sql = "SELECT * FROM SAMPLE01";
		List<Map<String,Object>> list = new ArrayList<>();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Map<String,Object> map = new HashMap();
			map.put("sabun", rs.getInt("sabun"));		
			map.put("name", rs.getString("name"));
			map.put("nalja", rs.getDate("nalja"));
			map.put("pay", rs.getInt("pay"));
			list.add(map);
		}
	if(rs!=null)rs.close();
	if(pstmt!=null)pstmt.close();
	if(conn!=null)conn.close();
	return list;
}
}
