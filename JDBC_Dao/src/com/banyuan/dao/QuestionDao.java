package com.banyuan.dao;

import com.banyuan.pojo.Question;

public interface QuestionDao {

     boolean  add(Question   question);

     boolean  del(Integer  qid);

     boolean   update(Question  question);

     //根据编号来查询问题对象
     Question   queryById(Integer  sid);





}
