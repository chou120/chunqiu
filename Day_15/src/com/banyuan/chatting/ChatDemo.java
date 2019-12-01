package com.banyuan.chatting;

import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatDemo {

    public static void main(String[] args) throws SocketException {
        DatagramSocket  ds=new DatagramSocket();  //发送端的
        DatagramSocket  ds2=new DatagramSocket(1122);  //作为接受段的端口号

        RevicedServer  rs=new RevicedServer(ds2);
        SendClient  sc=new SendClient(ds);

        Thread  t1=new Thread(rs);
        Thread t2=new Thread(sc);

        t1.start();
        t2.start();


    }



}
