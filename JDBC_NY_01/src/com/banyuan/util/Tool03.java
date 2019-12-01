package com.banyuan.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Tool03 {
    static   ComboPooledDataSource   dataSource=null;
    static{

        dataSource=new ComboPooledDataSource("first");

    }
    public  static Connection  getCon() throws SQLException {
        return  dataSource.getConnection();
    }



}
