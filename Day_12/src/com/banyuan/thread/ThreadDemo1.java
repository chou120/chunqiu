package com.banyuan.thread;

public class ThreadDemo1 {


    /*
        什么是线程？
     *  进程: 正在执行的程序   是系统分配资源和独立调用的
        线程: 是进程中的单个顺序掌控流  是一条执行路径
              一个进程只有一条执行路径    叫单线程
              一个 进程有多条执行路径     叫多线程
     */

    public static void main(String[] args) {
       // new Object();

         MyThread   my=new MyThread();
         MyThread  my2=new MyThread();
//        my2.run();
//       my.run();

        my.start();
        my2.start();




    }



}
