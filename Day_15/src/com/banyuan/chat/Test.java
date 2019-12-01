package com.banyuan.chat;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) throws SocketException {
        DatagramSocket  ds= new DatagramSocket(2222);
        RecivedServer  rs=new RecivedServer(ds);
        RecivedServer  rs2=new RecivedServer(ds);

        ExecutorService es=Executors.newFixedThreadPool(2);
        es.submit(rs);
        es.submit(rs2);
        es.shutdown();

    }

}
