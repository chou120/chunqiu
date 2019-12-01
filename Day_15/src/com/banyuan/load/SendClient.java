package com.banyuan.load;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SendClient {

    public static void main(String[] args) throws IOException {

        Socket  s=new Socket("192.168.11.22",3344);

        OutputStream   os=s.getOutputStream();
        os.write("夜夜夜夜夜夜".getBytes());

        s.close();


    }


}
