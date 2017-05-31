package com.hb.day02me.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SimpleDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public SimpleDao() {
		try {
			Class.forName("org.h2.Driver");
			conn=DriverManager.getConnection(
					"jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public List<SimpleVo> selectAll() throws SQLException {
		String sql="SELECT * FROM SIMPLE02";
		List<SimpleVo> list = new ArrayList<>();
		try{
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				SimpleVo vo = new SimpleVo();
				vo.setSabun(rs.getInt("sabun"));
				vo.setName(rs.getString("name"));
				vo.setNalja(rs.getString("nalja"));
				vo.setPay(rs.getInt("pay"));
				list.add(vo);
			}
		}finally {
			close();			
		}
		return list;
	}

	private void close() throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
		
	}
	
	public int insertOne(SimpleVo vo){
		String sql="insert into simple02 (name,nalja,pay) values (?,?,?)";
		try{
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(1, vo.getNalja());
			pstmt.setInt(1, vo.getPay());
			return pstmt.executeUpdate();
			
		}finally{
			return 0;
		}
	}
}