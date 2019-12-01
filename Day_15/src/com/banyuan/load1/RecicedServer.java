package com.banyuan.load1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class RecicedServer {

    static File file = new File("/Users/sanye/img/乔碧萝.jpg");




    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(3344);


        Socket s = ss.accept();

        InputStream is = s.getInputStream();


        byte[] by = new byte[40000];
        is.read(by);

        String   str=new String(by);
        String [] st=str.split("//|");
       // String filename=file+st[0];
        System.out.println(st[1]);


//        while (i != -1) {
//            by = new byte[100];
//            is.read(by);
//            System.out.println("--------------"+new  String(by));
////

         OutputStream   os=new FileOutputStream(file);
         os.write(by);
         os.close();

         OutputStream  o=s.getOutputStream();
         o.write("图片上传成功".getBytes());
         o.close();



        }
//      s.close();




}
