package tools;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0Util {
	
	//���� c3p0�� xml�ļ�  ��ȡ����Դ
	private   static   ComboPooledDataSource  dataSource=new ComboPooledDataSource("c3p0-config.xml");
	
	//����һ������
	public static Connection  getConnection() throws SQLException{	
		return   dataSource.getConnection();
	}



	
	public static ComboPooledDataSource getDataSource(){
		
		return  dataSource;
		
	}
	
	
	
}
