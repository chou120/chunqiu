package tools;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class DriudDbBUtil {
			
	public  static   DataSource getDataSource() throws Exception{
		Properties  pro=new Properties();
		
		pro.load(new  FileInputStream("src/driud.properties"));
		
		return  DruidDataSourceFactory.createDataSource(pro);
		
	}
	
	public  static  Connection getConn() throws SQLException, Exception{
		
		return  getDataSource().getConnection();
	}
	
	
	
}
