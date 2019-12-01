package com.banyuan.patten01;

public class UserDaoImpl  implements   UserDao{

    @Override
    public  boolean  login(String  name,String  pwd) {

        System.out.println(name+"成功登陆....");


        return  true;
    }
}
