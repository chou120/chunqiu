package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import method_Test_DBCP.DbcpAndDBUtil;
import pojo.User;
import tools.C3p0Util;
import tools.DBUtil_test_DBCP;
import tools.DbcpUtil;

public class TestDBCP {

	public static void main(String[] args) throws Exception {
	

		//String  sql="insert into user(uname,password)values(?,?)";
		//PreparedStatement  ps=DBUtil_test_DBCP.getConn().prepareStatement(sql);
		
		//DBCPû��ʹ�����ӳ�
		//PreparedStatement  ps=DBUtil_test_DBCP.getConn().prepareStatement(sql);
		
		
//		for (int i = 0; i < 100000; i++) {
//			User  user=new User();
//			user.setUname("admin"+i);
//			user.setPassword("123456"+i);
//			//DbcpAndDBUtil.writeDBByOne(user);      //不适用连接池 但是使用不断创建连接
//
//			//不适用连接池
//			DbcpAndDBUtil.writeByOne(user, ps);       // 不适用连接池  只创建一个连接
//
//			//DbcpAndDBUtil.writeByChi(user);	  //使用连接池
//		}
		long  start=System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {   //多次测试求出平均时间
			DbcpAndDBUtil.C3p0();
			//DbcpAndDBUtil.aliBaba();   //
			//DbcpAndDBUtil.DBCP();
		}

		long  end=System.currentTimeMillis();
		System.out.println("消耗时间为:"+(end-start)+"毫秒");
		
		
	
		
	}

}
