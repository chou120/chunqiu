package com.banyuan.test;

import com.banyuan.controller.UserController;
import com.banyuan.pojo.Student;

public class TestUser {

    public static void main(String[] args) {

        UserController   uc=new UserController();

     //   uc.add(new Student("刘国泰2","1234536","下水道2"));
        uc.del(2);



    }

}
