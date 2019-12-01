package com.banyuan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {

    /*
        这个就是测试数据库能不能连接
     */
    static Connection con = null;
    static  Statement st = null;
    static  ResultSet rs = null;
    static   PreparedStatement  ps=null;

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jian"; //  jdbc:mysql://localhost:端口号/数据库名字
        Scanner  scn=new Scanner(System.in);
        System.out.println("请输入账号:");
       String  username= scn.next();
        System.out.println("请输入密码:");
        String pwd= scn.next();
   //     String  sql="select *from   admin  where   username='"+username+"' and password= '"+pwd+"'";
        //  select *from   admin  where   username='john' and password= '1234'or'1'='1'   sql注入   如何防止sql注入
   //     System.out.println(sql);

        try {
            con=DriverManager.getConnection(url,"root", "zhou");
            String sql="select *from  admin  where username=? and  password=?";
           ps= con.prepareStatement(sql);  //对sql语句预先进行处理  防止sql语句注入
           ps.setString(1, username);
           ps.setString(2, pwd);
           rs=ps.executeQuery();

            //st=con.createStatement();
          // rs=st.executeQuery(sql);
           if(rs.next()){
               System.out.println("欢迎"+username+"登录");
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
