package com.banyuan.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class RecivedServer implements  Runnable {

    private DatagramSocket  ds=null;

    public RecivedServer(DatagramSocket  ds) {
        this.ds=ds;
    }

    @Override
    public void run() {

        while (true) {

            //创建接受数据的容器
            byte[] by = new byte[200];

            DatagramPacket dp = new DatagramPacket(by, by.length);
            try {
                ds.receive(dp);

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("内容长度:" + dp.getLength());
            InetAddress ip = dp.getAddress();
            by = dp.getData();


            System.out.println("地址为:" + ip + "数据为:" + (new String(by, 0, dp.getLength())));

            String str = new String(by, 0, dp.getLength());

            if(str.equals("88")){
                System.out.println(dp.getAddress().getHostName()+"say  "+str);
            }

        }


        }
}
