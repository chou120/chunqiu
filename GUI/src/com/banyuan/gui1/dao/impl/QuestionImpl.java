package com.banyuan.gui1.dao.impl;

import com.banyuan.gui1.dao.QuestionDao;
import com.banyuan.gui1.pojo.Question;
import com.banyuan.gui1.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class QuestionImpl implements QuestionDao {
    PreparedStatement  ps;
    ResultSet  rs;
    Connection  con;
    @Override
    public List<Question> getInfo() {
         String  sql="select  * from  question";
         List<Question>  list=new ArrayList<>();
        try {
            con= DBUtil.getCon();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
           while(rs.next()){
               Question  question=new Question();
               question.setQ_title(rs.getString(2));
               question.setQ_Answer_A(rs.getString(3));
               question.setQ_Answer_B(rs.getString(4));
               question.setQ_Answer_C(rs.getString(5));
               question.setQ_Answer_D(rs.getString(6));
               question.setQ_Answer(rs.getString(7));

                list.add(question);

           }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }
}
