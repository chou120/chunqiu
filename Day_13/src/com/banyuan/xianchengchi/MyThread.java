package com.banyuan.xianchengchi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {

    /**
     *  线程池的特性   线程执行完了之后 就会再次回到线程池里面  不会消失    变成了空闲状态   知道下一次被调用
     *
     *   线程不是越多越好   线程越多消耗内越大  降低了计算机执行效率
     *   减少了创建线程和销毁线程的次数  每个工作线程都会被重新利用 可以执行多个任务
     *
     *
     *
     */

    public static void main(String[] args) {

        System.out.println("当前计算机的核数:"+Runtime.getRuntime().availableProcessors());    //线程数等于核数的两倍
        //每个线程  需要 1MB内存


        ExecutorService es= Executors.newFixedThreadPool(8);
        Demo1  demo1=new  Demo1();
        Demo1  demo2=new  Demo1();
        Demo1  demo3=new  Demo1();
        Demo1  demo4=new  Demo1();
        Demo1  demo5=new  Demo1();
        Demo1  demo6=new  Demo1();
        Demo1  demo7=new  Demo1();
        Demo1  demo8=new  Demo1();

//           es.submit(demo1);
//           es.submit(demo2);
//           es.submit(demo3);
//           es.submit(demo4);
        es.execute(demo1);
        es.execute(demo2);
        es.execute(demo3);
        es.execute(demo4);
        es.execute(demo5);
        es.execute(demo6);
        es.execute(demo7);
        es.execute(demo8);


        es.shutdown();


    }


}
