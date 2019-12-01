package com.banyuan.patten01.test;

import com.banyuan.patten01.UserDao;
import com.banyuan.patten01.UserDaoImpl;
import com.banyuan.patten01.proxy.MyHandle;
import com.banyuan.patten01.service.UserService;
import com.banyuan.patten01.service.UserServiceImpl;

import java.lang.reflect.Proxy;

public class TestLogin {

    public static void main(String[] args) {

//        UserService  us=new UserServiceImpl();
//        us.login("陈浩", "123");

        /**
         * 因甲方无理的要求    输入的名字  长度只能是4个长度  在 不改动原有的代码情况下  怎么增加额外的功能
         */


        UserDaoImpl   userDaoimpl=new UserDaoImpl(); //被代理的对象
        MyHandle myHandle=new MyHandle(userDaoimpl);  //代理类对象

        /**
         *  public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         *     ClassLoader loade  类加载其 用来处理被代理对象的class文件 加载器
         *     userDaoimpl.getClass().getInterfaces()  被代理对象的接口
         *     myHandle   代理对象
         *
         */
      UserDao    ud=(UserDao) Proxy.newProxyInstance(userDaoimpl.getClass().getClassLoader(),userDaoimpl.getClass().getInterfaces(),myHandle);
      ud.login("你好", "123");

        /**
         *
         * jdk动态代理只能针对实现接口的类做代理    不能对没有实现接口的类做代理
         * cglib 动态代理    code  Generation  Library    可以在程序运行期间动态扩展类或者接口  他的底层是使用 java字节码操作框架 ASM  ---asm--.jar
         */






    }


}
