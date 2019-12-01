package com.banyuan;

import java.sql.*;
import java.util.Scanner;

public class Demo3 {

    /*

     */
    static Connection con = null;
    static  Statement st = null;
    static  ResultSet rs = null;
    static   PreparedStatement  ps=null;



    //jdbc  调用存储过程
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jian"; //  jdbc:mysql://localhost:端口号/数据库名字
        try{
            Scanner  sc=new Scanner(System.in);
            System.out.println("请输入账户:");
            String username=sc.next();
            System.out.println("请输入密码:");
            String  pwd=sc.next();

            con=DriverManager.getConnection(url, "root", "zhou");
            String  sql="{call  myp5(?,?)}";
           ps=con.prepareStatement(sql);
           ps.setString(1, username);
            ps.setString(2, pwd);
            int  result=ps.executeUpdate();
            if(result>0){
                System.out.println("插入成功....");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(st!=null){
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

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
