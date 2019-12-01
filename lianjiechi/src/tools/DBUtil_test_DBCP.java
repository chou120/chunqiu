package tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil_test_DBCP {
	
	private    static  final String url="jdbc:mysql://localhost:3306/jian";
	private    static  final String driver="com.mysql.jdbc.Driver";
	private    static  final String username="root";//���ݿ���˻���
	private    static  final String  password="zhou";//���ݿ����������	
	
	private    static   Connection con=null;
		//�����ݿ����ӵĹ�����
		public static   Connection  getConn(){		
			try {
				Class.forName(driver);
				
				con=DriverManager.getConnection(url, username, password);
				System.out.println("数据库连接成功....");
			} catch (Exception e) {			
				e.printStackTrace();
				System.out.println("数据库连接失败...");
				return null;
			}	
			return con;
		}
		
		//�ر�����
		public static  void   closeConn(){
			try {
				con.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	
		
		public static void main(String[] args) throws SQLException {
			
			System.out.println(getConn().isClosed());
			
			
		}
		
		
		
		
		
}
