package com.banyuan.controller;

import com.banyuan.pojo.Student;
import com.banyuan.service.UserService;
import com.banyuan.service.serviceImpl.UserServiceImpl;

public class UserController {

    UserService   us=new UserServiceImpl();

    public  void   add(Student stu){

       if( us.add(stu)){
           System.out.println("增加成功");
       }


    }

    public  void  del(Integer  sid){
         if( us.del(sid)){
             System.out.println("删除成功....");
         }
    }





}
