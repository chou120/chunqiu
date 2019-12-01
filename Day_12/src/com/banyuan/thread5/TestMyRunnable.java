package com.banyuan.thread5;

public class TestMyRunnable {

    public static void main(String[] args) {
        MyRunnale  m1=new MyRunnale();
       // MyRunnale  m2=new MyRunnale();

        Thread  t1=new Thread(m1);
        Thread  t2=new Thread(m1);
        t1.start();
        t2.start();

        



    }

}
