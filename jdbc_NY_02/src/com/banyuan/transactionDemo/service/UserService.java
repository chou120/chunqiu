package com.banyuan.transactionDemo.service;

import com.banyuan.transactionDemo.pojo.User;

import java.util.List;

public interface UserService {

    //写的是义务逻辑    让指定的张三 给李四转账  200块钱
    void     updateMoney(String   name1,double  money,String  name2);



    void   addUser(List<User>  list);


    List<User>  getByName(String  name);




}
