package com.banyuan.MyThreadHomework;

public class ThreadA extends Thread {

    Homework home;

    public ThreadA(Homework home) {
        this.home = home;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (home) {
                if (home.count <= 75) {
                    if (home.number == 1) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + home.count++);
                        }

                        home.number = 2;
                    }

                    try {
                        home.wait();
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
