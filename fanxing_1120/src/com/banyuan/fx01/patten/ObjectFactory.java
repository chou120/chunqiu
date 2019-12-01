package com.banyuan.fx01.patten;

public class ObjectFactory {

    //创建对象的事情交给了工厂类


    public   static    Student   getStudent(){  //学生    老师

     return   new  Student();
    }


    public   static    Teacher   getTeacher(){  //学生    老师

        return   new  Teacher();
    }


    public   static  Work  getWork(){
        return  new Work();
    }




}
