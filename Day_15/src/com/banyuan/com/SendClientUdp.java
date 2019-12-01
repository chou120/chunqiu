package com.banyuan.com;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class SendClientUdp {
    /*  udp
       1.创建套接字对象  Socket
       2.对数据进行打包
       3.再发送
     */



    public static void main(String[] args) throws IOException {

        //创建套接字  数据包的套接字
        DatagramSocket  ds=new DatagramSocket();
            //把数据打包
        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入要发送的数据:");
        String  str=sc.next();

        //地址  端口号
        InetAddress  ip=InetAddress.getByName("192.168.11.22");
        int  port=1122;

        DatagramPacket dp=new DatagramPacket(str.getBytes(),str.getBytes().length,ip,port);

        ds.send(dp);

        ds.close();



    }

}
