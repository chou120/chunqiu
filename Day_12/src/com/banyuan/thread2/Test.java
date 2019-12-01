package com.banyuan.thread2;

import com.banyuan.thread.MyThread;

public class Test {

    /**
     * java 使用抢占式调度模型
     * @param args
     */


    public static void main(String[] args) {
        ThreadDemo my=new ThreadDemo("线程1");
        ThreadDemo my2=new ThreadDemo("线程2");
//        ThreadDemo my3=new ThreadDemo("线程3");
//        ThreadDemo my4=new ThreadDemo("线程4");

//        my.setName("线程A");
//        my2.setName("线程B");

        my.setPriority(10);
        my2.setPriority(5);
//        my3.setPriority(1);
//        my4.setPriority(8);

        my.start();
        my2.start();
//        my3.start();
//        my4.start();




        System.out.println(Thread.currentThread().getName());


    }

}
