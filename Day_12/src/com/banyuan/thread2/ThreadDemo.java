package com.banyuan.thread2;

public class ThreadDemo  extends  Thread {

    public ThreadDemo(){

    }

    public ThreadDemo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <20; i++) {
            System.out.println(getName()+"--------"+i);
        }
    }
}
