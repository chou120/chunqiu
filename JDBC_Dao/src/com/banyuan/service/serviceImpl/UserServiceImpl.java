package com.banyuan.service.serviceImpl;

import com.banyuan.dao.UserDao;
import com.banyuan.dao.daoImpl.UserDaoImpl;
import com.banyuan.pojo.Student;
import com.banyuan.service.UserService;

public class UserServiceImpl implements UserService {


    UserDao ud=new UserDaoImpl();

    @Override
    public boolean add(Student student) {

        System.out.println("进入了...业务层的增加方法...");

        if(ud.add(student)){
            return  true;
        }
        return false;
    }

    @Override
    public boolean del(Integer sid) {

        if(ud.del(sid)){
            return  true;
        }
        return false;

    }
}
