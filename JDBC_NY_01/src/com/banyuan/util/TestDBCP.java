package com.banyuan.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDBCP {
    static PreparedStatement ps=null;
    static ResultSet rs=null;

    public static void main(String[] args) throws SQLException {

        Connection con=Tool02.getCon();

        String sql="select *from  admin";

        try {
            ps=con.prepareStatement(sql);

            rs=ps.executeQuery();
            if(rs.next()){
                System.out.println("如果存在.我就进来...");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
