package com.banyuan.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class C3p0_Util {

    private  static ComboPooledDataSource dataSource=new ComboPooledDataSource("c3p0-config.xml");


    public  static Connection getCon() throws SQLException {

        return   dataSource.getConnection();
    }



}
