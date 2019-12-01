package com.banyuan.cn;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class RecivedServer {


    public static void main(String[] args) throws IOException {
        //作为一个服务器   用来接受数据    这个服务器里面有  我的端口号
        /**
         * 端口号分为两类:  物理端口      网卡
         *                 逻辑端口     我们所指的就是逻辑端口
         */

        //第一点 要设置 端口号
        ServerSocket socket=new ServerSocket(1234);
        Socket s= socket.accept();//获取到套接字

        InputStream  is=s.getInputStream();
        byte[] by=new byte[20];
        is.read(by);
        String  str=new String(by);
        System.out.println(s.getInetAddress().getHostName()+"在说:"+str);

       // is.close();
        s.close();
        //System.out.println(s.getLocalPort());
    }


}
