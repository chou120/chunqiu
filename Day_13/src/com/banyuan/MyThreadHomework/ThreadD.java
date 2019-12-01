package com.banyuan.MyThreadHomework;

public class ThreadD extends   Thread {
    Homework  home;
    public ThreadD(Homework home){
        this.home=home;
    }


    @Override
    public void run() {
        while(true) {
            synchronized (home) {
                home.notifyAll();
            }
        }
    }
}
