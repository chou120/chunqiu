package tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class DbcpUtil {
	
	private  static Properties  properties=new Properties();
	private  static  BasicDataSource  dataSource=new  BasicDataSource();
	
	//DBCP链接池
	static{
		 try {
			FileInputStream  fis=new FileInputStream("src/db.properties");
			properties.load(fis);
			//获取数据源
			dataSource=BasicDataSourceFactory.createDataSource(properties);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 
	}
	public  static  DataSource  getDataSource(){
		return  dataSource;
	}
	
	
	
	public  static   Connection  getConnection() throws SQLException{
		
		return  dataSource.getConnection();
		
	}

		
	public static void main(String[] args) throws SQLException {
		
		System.out.println(getConnection().isClosed());
		
		
	}
	
	
}
