package com.banyuan.com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class RecivedServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket  ds=new DatagramSocket(1122);
        //创建接受数据的容器
        byte[] by=new byte[200];

        DatagramPacket dp=new DatagramPacket(by,by.length);
        ds.receive(dp);

        System.out.println("内容长度:"+dp.getLength());
        InetAddress ip=dp.getAddress();
        by= dp.getData();

        System.out.println("地址为:"+ip+"数据为:"+(new String(by, 0, dp.getLength())));



    }
}
