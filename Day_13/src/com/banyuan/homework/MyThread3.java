package com.banyuan.homework;

public class MyThread3 extends Thread {

    Tools tool;

    public MyThread3(Tools tool) {
        this.tool = tool;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tool) {
                if (tool.number <= 75) {
                    if(tool.n==3) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + (tool.number++));
                        }
                        tool.n=1;
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
