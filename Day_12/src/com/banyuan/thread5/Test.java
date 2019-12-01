package com.banyuan.thread5;


public class Test {

    public static void main(String[] args) {
        MyThread   m1=new MyThread("窗口A");
        MyThread   m2=new MyThread("窗口B");
        MyThread   m3=new MyThread("窗口C");
        MyThread   m4=new MyThread("窗口D");

        m1.start();
        m2.start();
        m3.start();
        m4.start();


    }

}
