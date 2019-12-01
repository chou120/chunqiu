package com.banyuan.cn;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendClient {

    /*
        UDP协议下: 1.创建客户端中Socket    并且要确定连接的服务器
                   2.连接成功之后 通过Socket 里面的IO进行数据传输

     */


    public static void main(String[] args) throws IOException {
        //这边是获取服务器端口号
        // Socket: 网络上 具有 唯一便是的ip地址和端口号组合在一起  构成的一个唯一的标识符套接字

        /** tcp
         * Socket:
         * 1.服务器客户端两头都要有套接字 Socket
         * 2.服务器和客户端之间的通信其实就是 Socket套接字之间的通信
         * 3.数据的传输其实就是 Socket 之间的IO传输
         */
//        计算机1                计算机2
//        应用程序               应用程序
//        Socket                Socket
//        端口号                 端口号
//                   IO
//
        Socket  socket=new Socket("192.168.11.22",1234);

        OutputStream  os=socket.getOutputStream();
        os.write("我是你爷爷".getBytes());

      //  os.close();
        socket.close();


    }

}
