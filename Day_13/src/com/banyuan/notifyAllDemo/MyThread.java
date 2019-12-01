package com.banyuan.notifyAllDemo;

public class MyThread  implements   Runnable {

    @Override
    public void run() {

        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"进来了");

            try {
                this.wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"线程有没有执行到.....");


        }

    }
}
