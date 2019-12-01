package com.banyuan.transactionDemo.service;

import com.banyuan.transactionDemo.dao.UserDao;
import com.banyuan.transactionDemo.dao.UserDaoImpl;
import com.banyuan.transactionDemo.pojo.User;
import com.banyuan.transactionDemo.util.DBUtil;

import java.sql.SQLException;
import java.util.List;

public class UserSericeImpl  implements   UserService {

    UserDao   userDao= new UserDaoImpl();

    @Override
    public void updateMoney(String name1, double money, String name2) {

       try {
           DBUtil.con.setAutoCommit(false); //设置自动提交为 手动提交
           userDao.update(name1,-money);
           System.out.println(1/0);   //转账的时候出现了问题
           userDao.update(name2,+money);

           DBUtil.con.commit();
       }catch ( Exception  e){
           try {
               DBUtil.con.rollback();
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }


    }

    @Override
    public void addUser(List<User> list) {

        userDao.addUser(list);
    }


    @Override
    public List<User> getByName(String name) {
        return userDao.getByName(name);
    }
}
