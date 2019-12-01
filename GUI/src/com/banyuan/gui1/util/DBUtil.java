package com.banyuan.gui1.util;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBUtil {


    private  static ComboPooledDataSource dataSource=new ComboPooledDataSource("src/c3p0-config.xml");


    public  static Connection getCon() throws SQLException {

        return   dataSource.getConnection();
    }


}
