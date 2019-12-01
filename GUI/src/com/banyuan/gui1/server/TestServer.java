package com.banyuan.gui1.server;

import com.banyuan.gui1.controller.UserController;
import com.banyuan.gui1.service.UserService;
import com.banyuan.gui1.service.UserviceImpl;

import java.io.IOException;

public class TestServer {

    public static void main(String[] args) throws IOException {

        ServerDemo   sd=new ServerDemo();
        sd.serverinit();
        Thread   t=new Thread(sd);
        t.start();

        //从客户端接收数据的功能     客户端 相当于  mvc 模式的    pojo+dao +Service   Controller       <----   view(客户端)

        UserService  us=new UserviceImpl();
        UserController   uc=new UserController(sd,us);  //保持整个项目启动只有唯一的一个  ServerDemo 对象

        uc.recevieClient();



    }


}
