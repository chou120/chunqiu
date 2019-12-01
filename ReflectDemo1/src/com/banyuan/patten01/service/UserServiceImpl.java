package com.banyuan.patten01.service;

import com.banyuan.patten01.UserDao;
import com.banyuan.patten01.UserDaoImpl;

public class UserServiceImpl  implements  UserService {

    UserDao  userDao =new UserDaoImpl();

    @Override
    public boolean login(String name, String pwd) {
       return      userDao.login(name,pwd);
    }
}
