package com.banyuan.load1;

import java.io.*;
import java.net.Socket;

public class SendClient {

    public static void main(String[] args) throws IOException {

        Socket  s=new Socket("192.168.11.22",3344);
        File file=new File("/Users/sanye/IdeaProjects/Day_15/img/乔碧萝.jpg");

        //获取文件名字
        String   filename=file.getName();

        StringBuffer  sb=new StringBuffer();


        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        byte[] by=new  byte[(int)file.length()];

        System.out.println(by.length);

        bis.read(by);

        sb.append(new String(by)+"|");
        sb.append(filename);

        OutputStream   os=s.getOutputStream();
        BufferedOutputStream  bos=new BufferedOutputStream(os);

        //while(true){
            //先写名字
//            bos.write(filename.getBytes());
//            bos.flush();
            bos.write(sb.toString().getBytes());
            bos.flush();
    //    }
        //
        s.shutdownOutput(); //只有在客户端输入结束的时候才能    在客户端继续读取服务器端返回来的数据
       InputStream  i= s.getInputStream();
       byte[] b1=new byte[18];
            i.read(b1);
            i.close();
        System.out.println(new String(b1));
        s.close();


    }


}
