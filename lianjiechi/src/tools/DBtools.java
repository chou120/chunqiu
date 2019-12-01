package tools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBtools {
	public static PreparedStatement ps=null;
	public static ResultSet  rs=null;
	public static String  url=null;
	public static String  driver=null;
	public static String  username=null;
	public static String  password=null;
	
	public static Connection  conn=null;
	
		static{
						   // xxx�� class�ļ� ��������ȡ ��Դ�ļ�
			InputStream  is=DBtools.class.getClassLoader().getResourceAsStream("db.properties");
			
			Properties   p= new  Properties();
			try {
				p.load(is);  
			
				url=p.getProperty("url");
				driver=p.getProperty("driver");
				username=p.getProperty("username");
				password=p.getProperty("password");
					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//��ȡ���˻��� ���� ��ַ������֮��  �������ӷ���
		public  static  void  getConnct(){
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url, username, password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static  void  closeConnect(){
			try {
				if(rs!=null){
					rs.close();
				}
				if(ps!=null){
					ps.close();
				}
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
}
