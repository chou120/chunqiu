package com.banyuan.homework;

import java.util.concurrent.CountDownLatch;

public class Tools {

    //四个线程 其中A,B线程对每次对i增加1  C.D线程每次对i减1

    /*
        CountDownLatch   类似于一个线程的计数器   能够使一个或者多个线程等待其他线程执行完毕   之后 再继续工作

        getCount();  获取线程数量
        countDown();  每一个线程执行完毕之后  线程数 减1
        await()  调用这个方法的时候   在此之前执行线程都会进入  阻塞状态    知道计数器为0   除非线程中断

     */



    int  i=0;

    CountDownLatch   cd=new CountDownLatch(2);

    boolean  flag=true;

    public    void   add(){

        ++i;
        System.out.println(Thread.currentThread().getName()+"进来了...执行了++:"+(i));

    }

    public    void   del(){

        --i;
        System.out.println(Thread.currentThread().getName()+"进来了...执行了--:"+(i));

    }


}
