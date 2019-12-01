package com.banyuan.dao.daoImpl;

import com.banyuan.dao.UserDao;
import com.banyuan.pojo.Student;
import com.banyuan.util.C3p0_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDaoImpl  implements UserDao {

    Connection  con=null;
    PreparedStatement  ps=null;


    //dao层  写一些sql语句

    @Override
    public boolean add(Student student) {

      try {
            con= C3p0_Util.getCon();
            String  sql="insert  into   student(sname,spwd,address)values(?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, student.getSname());
            ps.setString(2, student.getSpwd());
            ps.setString(3, student.getAddress());
            int   result=ps.executeUpdate();
            if(result>0){
                return true;
            }
      }catch ( Exception e){
          e.printStackTrace();
      }finally {
          try {
              if (ps != null) {
                  ps.close();
              }
              if(con!=null){
                  con.close();
              }
          }catch ( Exception e){
              e.printStackTrace();
          }
      }

        return  false;


    }

    @Override
    public boolean del(Integer sid) {

       try {
           con= C3p0_Util.getCon();
           String  sql="delete from  student  where  sid=?";
           ps=con.prepareStatement(sql);
           ps.setInt(1, sid);
          int  result=ps.executeUpdate();
          if(result>0){
              return true;
          }

       }catch ( Exception  e){
           e.printStackTrace();
       }
        return false;

    }
}
