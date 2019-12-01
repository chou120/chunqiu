package util;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo5 {


    // 作业:如何把 对数据库操作的 api对象也提取 到一个工具类里面去
    static PreparedStatement   ps=null;
    static ResultSet  rs=null;

    public static void main(String[] args) {

        Connection  con=DBUtil.getConnection();

        try {
           ps= con.prepareStatement("select *from  admin");

          rs=ps.executeQuery();
           while(rs.next()){
               System.out.println(rs.getString(2)+"====="+rs.getString(3));
           }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
