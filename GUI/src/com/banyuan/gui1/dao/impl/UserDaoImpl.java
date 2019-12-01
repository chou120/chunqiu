package com.banyuan.gui1.dao.impl;

import com.banyuan.gui1.dao.UserDao;
import com.banyuan.gui1.pojo.Admin;
import com.banyuan.gui1.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {


    PreparedStatement  ps=null;
    Connection  con=null;
    ResultSet  rs=null;

    @Override
    public boolean queryByNameAndByPwd(String uname, String pwd) {
        String  sql="select * from   admin  where   username=? and  password=?";
        try {
            con= DBUtil.getCon();

            ps=con.prepareStatement(sql);

            ps.setString(1, uname);
            ps.setString(2, pwd);

            rs=ps.executeQuery();


           if(rs.next()){
               return  true;
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
           try {
               rs.close();
               ps.close();
               con.close();
           }catch (Exception e){
               e.printStackTrace();
           }
        }
    return false;
    }

    @Override
    public boolean queryByName(String uname, String pwd) {
        String  sql="select * from   student  where   sname=? and  spwd=?";
        try {
            con= DBUtil.getCon();
            ps=con.prepareStatement(sql);

            ps.setString(1, uname);
            ps.setString(2, pwd);

            rs=ps.executeQuery();

            if(rs.next()){
                return  true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return false;
    }
}
