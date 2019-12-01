package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import tools.C3p0Util;

public class TestC3p0 {

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		PreparedStatement  ps=null;
		String  sql="insert  into user(uid,uname,password) values(?,?,?)";
		conn=C3p0Util.getConnection();
		ps=conn.prepareStatement(sql);
		ps.setInt(1, 125);
		ps.setString(2,"哈哈哈");
		ps.setString(3,"大保健");
		
		int  rows=ps.executeUpdate();
		if(rows>0){
			System.out.println("插入成功");
		}
		
	}

}
