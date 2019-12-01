package com.banyuan.gui1.dao;

import com.banyuan.gui1.pojo.Admin;

public interface UserDao {

     //这是老师登录的
     boolean queryByNameAndByPwd(String uname,String pwd);

     //这是学生登录方法

     boolean queryByName(String uname,String pwd);

}
