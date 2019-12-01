package com.banyuan.thread5;


import java.util.Date;

public class MyRunnale implements  Runnable {

    static  int   ticket=100;
    //Object  o=new Object();
   // Student  s=new Student();


//    @Override
//    public synchronized void run() {  //同步方法锁是  this
//        while(true) {
//
//                   if(ticket>0){
//                        System.out.println(Thread.currentThread().getName() + "在卖第" + (ticket--) + "张票");
//                   try {
//                       Thread.sleep(10);
//                   } catch (InterruptedException e) {
//                       e.printStackTrace();
//                   }
//
//            //有3个线程  输出200到400之间的所有数据   如果是奇数 就输出当前线程的名称
//
//                       // 模拟多个人过山洞   这个山洞每次只能过一个人  每个人过山洞的时间为5M秒  现在有10个人要过这个山洞
//                      // 显示每个人过山洞的姓名和顺序；
//
//
//            }
//
//        }
//    }


    @Override
    public void run() {
        show();
    }

    public static  synchronized void show() {  //静态的同步方法的锁是谁？     类的字节码文件
            while(true) {

                if(ticket>0){
                    System.out.println(Thread.currentThread().getName() + "在卖第" + (ticket--) + "张票");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //有3个线程  输出200到400之间的所有数据   如果是奇数 就输出当前线程的名称

                    // 模拟多个人过山洞   这个山洞每次只能过一个人  每个人过山洞的时间为5M秒  现在有10个人要过这个山洞
                    // 显示每个人过山洞的姓名和顺序；


                }

            }
}



}
