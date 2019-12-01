package com.banyuan.notifyAllDemo;


public class Test {

    public static void main(String[] args) {

        MyThread  mt=new MyThread();
        Thread   t1=new  Thread(mt);
        Thread   t2=new  Thread(mt);
        Thread   t3=new  Thread(mt);
        t1.start();
        t2.start();
        t3.start();

        MyThread2  my2=new MyThread2(mt, "线程A");
        my2.start();


       // sleep  和  wait()  当线程遇到sleep休眠指定时间 释放对象锁     wait() 让线程高高挂起 等待唤醒  此时对象锁 不释放对象锁




    }


}
