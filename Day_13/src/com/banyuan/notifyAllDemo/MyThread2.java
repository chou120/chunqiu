package com.banyuan.notifyAllDemo;


public class MyThread2  extends  Thread {

    MyThread  mt;

    public   MyThread2(MyThread mt,String  name){
        super(name);
        this.mt=mt;
    }


    @Override
    public void run() {
            synchronized (mt){
                mt.notifyAll();
                System.out.println(Thread.currentThread().getName()+"进来了");

            }
    }
}
