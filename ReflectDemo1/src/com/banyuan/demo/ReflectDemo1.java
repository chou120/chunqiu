package com.banyuan.demo;

import java.util.Map;

public class ReflectDemo1 {
    /**
     *   在运行状态中  对于任意一个类（class文件） 都能知道这个里面的所有的属性和方法
     *   对于任意 一个对象  都能调用它的人一个方法和属性
     *   这种动态的获取信息以及动态调用对象的方法的功能被称为  java反射机制
     *
     *
     *  如果给一个完整的程序添加额外的功能   需要 一个 对外的接口 和一个具体的 class文件
     *
     *  可以利用反射 给指定 项目添加额外的功能
     *
     *
     *
     */


    public static void main(String[] args) {

        /**
         * 如何对class文件进行解剖
         * 字节码文件     Person.class
         * 如何获取类的字节码文件
         * Person.getClass()
         *
         *
         */

//        Person   p=new Person();
//        Class   clazz= p.getClass();
//        Person   p2=new Person();
//        Class   clazz1=p2.getClass();
//
//        System.out.println(clazz==clazz1);  //true
//
//

//        Class  clazz=Person.class;
//        Class  clazz2=Person.class;



        String   className="com.banyuan.demo.Person";
        try {
            Class  clazz= Class.forName(className);

            System.out.println(clazz);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}
