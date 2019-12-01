package com.banyuan.thread4;

public class Test {


    public static void main(String[] args) {
        MyThread  m1=new MyThread();
        MyThread  m2=new MyThread();
        MyThread  m3=new MyThread();
        m1.start();
        try {
            Thread.sleep(100);
          //  m1.stop();
         m1.interrupt();  //调用异常
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        m2.start();
        m3.start();

    }

}
