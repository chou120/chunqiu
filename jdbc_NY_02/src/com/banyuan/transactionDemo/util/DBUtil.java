package com.banyuan.transactionDemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

  public static  Connection con=null;



   static {
       String  url="jdbc:mysql://localhost:3306/jian";
       String  driver="com.mysql.jdbc.Driver";
       String  username="root";
       String  password="zhou";

       try {
           Class.forName(driver);
           try {
               con= DriverManager.getConnection(url, username,password);

           } catch (SQLException e) {
               e.printStackTrace();
           }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

    public   static  void  closeCon(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
