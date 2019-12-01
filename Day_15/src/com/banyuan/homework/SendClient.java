package com.banyuan.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendClient {

    public static void main(String[] args) throws IOException {
        DatagramSocket  ds=new DatagramSocket();
        InetAddress  ip=InetAddress.getByName("192.168.11.22");
        while(true){
            Scanner  sc=new Scanner(System.in);
            System.out.println("请输入内容:");
            String str=sc.next();

            DatagramPacket   dp=new DatagramPacket(str.getBytes(), str.getBytes().length, ip, 2222);

            ds.send(dp);
            if(str.equals("88")){
                ds.close();
                break;
            }

        }

    }

}
