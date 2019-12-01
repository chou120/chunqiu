package com.banyuan.MyThreadHomework;

public class ThreadB extends   Thread {

    Homework  home;
    public ThreadB(Homework home){
        this.home=home;
    }


    @Override
    public void run() {
        while (true) {
            synchronized (home) {
                if (home.count <= 75) {
                    if(home.number==2) {
                        for (int i = 0; i < 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ":" + (home.count++));
                        }
                        home.number=3;
                    }

                    try {
                        home.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }

        }

    }
}
