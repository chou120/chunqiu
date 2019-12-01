package com.banyuan.homework;

public class MyThread2 extends Thread {

    Tools tool;

    public MyThread2(Tools tool) {
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tool) {
                if (tool.number <= 75) {
                    if(tool.n==2) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + (tool.number++));
                        }
                        tool.n=3;
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
