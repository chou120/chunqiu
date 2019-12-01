package com.banyuan.transactionDemo.dao;

import com.banyuan.transactionDemo.pojo.User;

import java.util.List;

public interface UserDao {

    void   update(String  name,Double money);
    public  void  addUser(List<User> list);


     List<User>  getByName(String  name);




}
