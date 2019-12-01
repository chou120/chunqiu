package com.banyuan.thread5;

public class MyThread extends Thread {

    static   int  ticket=100;

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
       while(true) {
           if(ticket>0){
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(Thread.currentThread().getName() + "在卖第" + ticket-- + "张票");
           }

       }
    }
}
