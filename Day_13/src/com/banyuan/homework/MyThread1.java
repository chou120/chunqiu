package com.banyuan.homework;

import com.banyuan.cn.Mythread;

public class MyThread1   extends   Thread {

    Tools  tool;
    public MyThread1(Tools  tool){
        this.tool=tool;
    }

    @Override
    public void run() {
        while(true){
            synchronized (tool){
                if (tool.number <= 75) {
                    if(tool.n==1) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + (tool.number++));
                        }
                        tool.n=2;
                    }
                    try {
                        tool.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {

                    break;
                }


            }


        }

    }
}
