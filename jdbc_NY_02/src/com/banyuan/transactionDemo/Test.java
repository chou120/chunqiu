package com.banyuan.transactionDemo;

import com.banyuan.transactionDemo.pojo.User;
import com.banyuan.transactionDemo.service.UserSericeImpl;
import com.banyuan.transactionDemo.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        UserService  userService=new UserSericeImpl();
       // userService.updateMoney("张三", 200, "李四");
//
//        List<User> list=new ArrayList<>();
//        list.add(new User("王五", "123", 1234.0));
//        list.add(new User("王五2", "123", 1234.0));
//        list.add(new User("王五3", "123", 1234.0));
//        list.add(new User("王五4", "123", 1234.0));

       // userService.addUser(list);

        List<User>  list1=userService.getByName("2");
        for (User   u:list1) {
            System.out.println(u.toString());
        }



    }

}
