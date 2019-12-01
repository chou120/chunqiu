package com.banyuan.gui1.service;

import com.banyuan.gui1.dao.UserDao;
import com.banyuan.gui1.dao.impl.UserDaoImpl;

public class UserviceImpl  implements   UserService{


    private UserDao   ud=new UserDaoImpl();


    @Override
    public boolean login(String name, String pwd) {

       return  ud.queryByNameAndByPwd(name,pwd);


    }

    @Override
    public boolean loginStu(String name, String pwd) {
        return ud.queryByName(name,pwd);
    }


}
