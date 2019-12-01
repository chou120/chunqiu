package com.banyuan.load;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class RecicedServer   {

     static File   file=new File("socket.txt");

    static{
        if(!file.exists()){
            try {
                file.createNewFile();
                System.out.println("文件被创建....");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws IOException {

        ServerSocket   ss=new ServerSocket(3344);
        Socket s=ss.accept();

       InputStream  is= s.getInputStream();

       byte[]  by=new byte[20];


       is.read(by);

//        StringBuffer   sb=new StringBuffer(new String(by));
//
//        System.out.println("-------"+sb);

        OutputStream   os=new FileOutputStream(file);
       os.write(by);
       os.close();

        System.out.println(new  String(by));
        s.close();




    }



}
