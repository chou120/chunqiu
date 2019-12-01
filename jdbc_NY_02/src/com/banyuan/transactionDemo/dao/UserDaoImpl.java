package com.banyuan.transactionDemo.dao;

import com.banyuan.transactionDemo.pojo.User;
import com.banyuan.transactionDemo.util.DBUtil;
import com.sun.tools.internal.xjc.model.CBuiltinLeafInfo;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements   UserDao {

    PreparedStatement ps;
    Connection  con;


    @Override
    public void update(String name, Double money) {
        String  sql="update   user  set money=money+? where   uname = ?";
        con= DBUtil.con;
        try {
            ps=con.prepareStatement(sql);
            ps.setDouble(1, money);
            ps.setString(2, name);

           int  result= ps.executeUpdate();
           if(result>0) {
               System.out.println("数据库里面数据已经更新成功");
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        /**
         *
         * insert  into   table  values(,,,,,),(,,,,,),(,,,,,),(,,,,,,,)
         *
         */



    }

    //批处理   增加
//    public  void  addUser(List<User> list){
//        String  sql="insert  into user(uname,password,money)values(?,?,?)";
//        try {
//            ps=DBUtil.con.prepareStatement(sql);
//           for (int i=0;i<list.size();i++){
//               ps.setString(1, list.get(i).getUname());
//               ps.setString(2, list.get(i).getPassword());
//               ps.setDouble(3, list.get(i).getMoney());
//               ps.executeUpdate();
//           }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


 //   }


    public  void  addUser(List<User> list) {
        String sql = "insert  into user(uname,password,money)values(?,?,?)";
        try {
            QueryRunner qr = new QueryRunner();
            Object[][] obj = new Object[list.size()][];
            for (int i = 0; i < list.size(); i++) {
                obj[i] = new Object[]{list.get(i).getUname(), list.get(i).getPassword(), list.get(i).getMoney()};
            }
            int[] result = qr.batch(DBUtil.con, sql, obj);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<User> getByName(String name) {
       String  sql="select * from  user where  uname  like  ?";
      //      String  sql="select *from  user";
       QueryRunner   qr=new QueryRunner();
        List<User>  list=null;
        try {
            list=qr.query(DBUtil.con,sql, new BeanListHandler<User>(User.class),"%"+name+"%");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    /**
     * 如何做 批量删除     给一组  id编号     根据编号删除
     */

}
