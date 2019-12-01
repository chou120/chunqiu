package com.banyuan.util;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Tool02 {

    /**
     * dbcp
     */
    static BasicDataSource   basicDataSource;
    static{
        try {
            FileInputStream   fis=new FileInputStream("src/db.properties");
            Properties  p=new Properties();
            p.load(fis);

            basicDataSource=BasicDataSourceFactory.createDataSource(p);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

       public  static Connection getCon() throws SQLException {

        return   basicDataSource.getConnection();

       }



}
