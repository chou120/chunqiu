package com.banyuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

/*
    这个就是测试数据库能不能连接
 */
    public static void main(String[] args) {
    String url="jdbc:mysql://localhost:3306/jian"; //  jdbc:mysql://localhost:端口号/数据库名字
        Connection  con=null;
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
          con= DriverManager.getConnection(url,"root","zhou");
            if(con!=null){
                //前提是数据库服务器以及开启了
                System.out.println("我已经获取到连接了....");
            }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }



}
