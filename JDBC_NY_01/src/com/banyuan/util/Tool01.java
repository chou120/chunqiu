package com.banyuan.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Tool01 {

    //连接数据库的工具
    //DButils
        static   String  url=null;
        static   String  driver=null;
        static   String  username=null;
        static   String  password=null;


    //获取文件里面的配置
    static {
        InputStream  is= Tool01.class.getClassLoader().getResourceAsStream("db.properties");
        Properties  p=new Properties();
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

    public   static Connection getCon(){
        try {
            Class.forName(driver);
        return   DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            e.printStackTrace();
        }


        return  null;
    }





}
