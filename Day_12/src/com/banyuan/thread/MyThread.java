package com.banyuan.thread;

public class MyThread extends   Thread {

    @Override
    public void run() {

       // System.out.println("我是线程run方法");

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }


    }
}
