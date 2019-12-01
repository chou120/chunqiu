package com.banyuan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    /*
        这个就是测试数据库能不能连接
     */
    static Connection con = null;
    static  Statement st = null;
    static  ResultSet rs = null;
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jian"; //  jdbc:mysql://localhost:端口号/数据库名字
        String  sql="select  *from   admin  where   id=2";
        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.创建连接
            con = DriverManager.getConnection(url, "root", "zhou");
//            List<Admin>  list=getShow(con,sql);
//            for (Admin  admin:list) {
//                System.out.println("编号为:"+admin.getId()+"，姓名："+admin.getUsername()+",密码："+admin.getPassword());
//            }
            sql="insert  into  admin(username,password)values('李四','123')";
            st= con.createStatement();
          //  int  result= st.executeUpdate(sql);
//            if(result>0){
//                System.out.println("插入成功....");
//            }
        //    boolean flag=st.execute(sql);  //这个方法容易让开发人员产生误解   不建议使用
          //  System.out.println("0----0"+flag);

           //sql="delete from admin where  id=14";

            sql="update  admin  set  username='沾上干' where id=13";

           int   result=st.executeUpdate(sql);
            if(result>0){
                System.out.println("更新成功...");
            }





        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }

//现在有一个方法   用来获取数据库表里面的所有数据   为了方便其他方法调用

    public static List<Admin> getShow(Connection con,String sql) {

        List<Admin>  list=new ArrayList();

        try {

            st= con.createStatement();
            rs= st.executeQuery(sql);

            while(rs.next()){
                Admin  admin=new Admin();
                admin.setId(rs.getInt("id"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));
                list.add(admin);
            }

            return  list;

        }catch ( Exception e){
            e.printStackTrace();

        }


        return  null;
    }


}
