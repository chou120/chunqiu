package com.banyuan.fx01.patten04;

public class MyThread  extends  Thread {


    public  volatile    static  int  count;


    public  synchronized   static   void   addCount(){

        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("---"+count);
    }


    @Override
    public void run() {
        addCount();
    }
}
