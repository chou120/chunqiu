package method_Test_DBCP;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import pojo.User;
import tools.C3p0Util;
import tools.DBUtil_test_DBCP;
import tools.DbcpUtil;
import tools.DriudDbBUtil;

public class DbcpAndDBUtil {
	
	static PreparedStatement  ps=null;
	static Connection conn=null;
	
	//��ʹ�����ӳؼ���     ÿдһ�����ȥ����һ������
	public  static void   writeDBByOne(User  user) throws SQLException{
		
		String  sql="insert into user(uname,password)values(?,?)";
		conn =DBUtil_test_DBCP.getConn();
		ps=conn.prepareStatement(sql);
		
		ps.setString(1, user.getUname());
		ps.setString(2, user.getPassword());
		ps.executeUpdate();
		
	
	}
	
	//��ʹ�����ӳؼ���    ֻ��һ������  д�������е�����
	public   static  void  writeByOne(User  user,PreparedStatement  ps) throws SQLException{
	
		ps.setString(1, user.getUname());
		ps.setString(2, user.getPassword());
		
		ps.executeUpdate();

	} 

	
	//ʹ�����ӳؼ���
	public   static  void  writeByChi(User  user){
		String  sql="insert into user(uname,password)values(?,?)";
	//	System.out.println(sql);
		try {
			conn=DbcpUtil.getConnection();
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			
			ps.executeUpdate();
			conn.close(); 
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

	}



	public  static List<User> C3p0() throws SQLException, Exception{

		String  sql="select *from  user";

		QueryRunner  qr=new QueryRunner(C3p0Util.getDataSource());

		return  qr.query(sql, new BeanListHandler<User>(User.class));


	}


	//alibaba
	public  static void aliBaba() throws SQLException, Exception{
	
		String  sql="select *from  user";

		QueryRunner  qr=new QueryRunner(DriudDbBUtil.getDataSource());
		qr.query(sql,new BeanListHandler<User>(User.class));

		
		
	}
	
	public  static List<User> DBCP() throws SQLException, Exception{
		
		String  sql="select *from  user";

		QueryRunner  qr=new QueryRunner(DbcpUtil.getDataSource());
		
		return  qr.query(sql, new BeanListHandler<User>(User.class));
		
		
	}
	
	
	
}
