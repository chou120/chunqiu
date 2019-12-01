package com.banyuan.patten01.proxy;

import com.banyuan.patten01.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler {

    //代理类  做验证的事情

    /**
     * @param proxy   代理对象 UserDao
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    private UserDao userDao;  //被代理对象

    public MyHandle(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        //        for (Object   obj: args) {
        //            System.out.println(obj);
        //        }
        Object obj=null;
        if(args[0]  instanceof  String){
                String   str=(String)args[0] ;
                if(str.length()<3 ||  str.length()>6){
                    System.out.println("你的太长了...");
                }else{
                    //在执行目标方法之前进行数据验证
                    obj= method.invoke(userDao, args);
                }

            }
        System.out.println("+++++"+obj);   //obj 是目标方法的返回值

        return obj;
    }


}
