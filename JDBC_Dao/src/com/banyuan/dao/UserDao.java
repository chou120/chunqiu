package com.banyuan.dao;

import com.banyuan.pojo.Student;

public interface UserDao {

    //管理员可以添加学生
    boolean add(Student student);

    //根据学生编号来删除学生
    boolean  del(Integer  sid);


}
