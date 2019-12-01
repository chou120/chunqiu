package com.banyuan.gui1.server;

import com.banyuan.gui1.dao.UserDao;
import com.banyuan.gui1.dao.impl.UserDaoImpl;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo implements Runnable {

    private  ServerSocket  ss;
    private   Socket  s;
    private   ObjectOutputStream  oos;
    private   ObjectInputStream   ois;


    public    void  serverinit() throws IOException {
        ss=new ServerSocket(9090);
        System.out.println("服务器已经启动...");

    }

    public  void  closeServer() throws IOException {
            ois.close();
            oos.close();
            s.close();
            ss.close();

    }


    public ServerSocket getSs() {
        return ss;
    }

    public void setSs(ServerSocket ss) {
        this.ss = ss;
    }

    public Socket getS() {
        return s;
    }

    public void setS(Socket s) {
        this.s = s;
    }

    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }

    public ObjectInputStream getOis() {
        return ois;
    }

    public void setOis(ObjectInputStream ois) {
        this.ois = ois;
    }

    @Override
    public void run() {

        while (true){
              //
            try {
                //设置循环接收  套接字
                s=ss.accept();
                oos=new ObjectOutputStream(s.getOutputStream());
                ois=new ObjectInputStream(s.getInputStream());

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }







}
