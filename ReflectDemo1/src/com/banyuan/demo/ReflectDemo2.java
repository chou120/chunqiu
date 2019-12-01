package com.banyuan.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo2 {


    public static void main(String[] args) {

        //推荐使用最后一种方式   扩展性强 方便管理
        //获取到了字节码文件创建对象和new  一个对象有什么不同？

        // com.banyuan.demo.Person  p=new  com.banyuan.demo.Person();
        String className = "com.banyuan.demo.Person";
        try {
            Class  clazz=Class.forName(className);
            Object  obj=   clazz.newInstance();

           // com.banyuan.demo.Person  p=new  com.banyuan.demo.Person("小明",12);
           Constructor    con= clazz.getConstructor(String.class,int.class);
            System.out.println(con.getName() );
            obj=con.newInstance("大明",32);

            System.out.println(obj.toString());

            //获取所有的构造器  在反射面前没有隐私    暴力访问
            Constructor[]  cons= clazz.getDeclaredConstructors();

            //Constructor[] cons=  clazz.getConstructors();
//            for (int i = 0; i <cons.length; i++) {
//                System.out.println(cons[i]);
//            }

          Field  field= clazz.getDeclaredField("address");
            obj=   clazz.newInstance();
        //    System.out.println(field.get(obj));

            Field []  fields=    clazz.getDeclaredFields();

            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            field= clazz.getDeclaredField("name");
            field.setAccessible(true);  //对于私有化的属性可以进行暴力访问
            field.set(obj,"陈浩");

            Object   ob=field.get(obj);
            System.out.println("-------"+ob);

         //  Method [] methods= clazz.getMethods();

            Method[] methods=  clazz.getDeclaredMethods();

            for (Method   me:methods) {
                System.out.println(me);
            }
            System.out.println("-----------------------");

           // Method  method=clazz.getMethod("show2", null);

            //如果获取的是指定的方法 但是此方法是一个私有化方法  那么可以设置此方法可以被暴力访问
            Method method= clazz.getDeclaredMethod("show", String.class,int.class);
                method.setAccessible(true); //设置暴力访问

          // Constructor co=  clazz.getConstructor(int.class);

            obj=clazz.newInstance();  //如果无参构造器是私有化的 那么这样就容易出错

           method.invoke(obj,"乘号",1);  //可以在此处设置方法的参数


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
