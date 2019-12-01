package com.banyuan.thread3;

public class Test {
    public static void main(String[] args) {
        ThreadSleep  t1=new ThreadSleep("线程1");
        ThreadSleep  t2=new ThreadSleep("线程2");
        ThreadSleep  t3=new ThreadSleep("线程3");

        t1.setDaemon(true);

        t1.start();
//        try {
//            t1.join(); //让当前线程执行完毕   后面线程再继续执行
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        t2.start();
        t3.start();


    }
}
