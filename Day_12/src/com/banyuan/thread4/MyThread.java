package com.banyuan.thread4;

import java.util.Date;

public class MyThread extends  Thread {


    @Override
    public void run() {
        System.out.println("start time...:"+new Date()+"---");
        for (int i=0;i<20;i++){
            System.out.println(Thread.currentThread().getName()+"----"+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"发生了异常中断...");

            }
        }
        System.out.println(Thread.currentThread().getName()+"end time...:"+new Date()+"---");
    }
}

