package com.banyuan.fx01.patten04;

public class SingleThread extends   Thread {

    @Override
    public void run() {

            System.out.println(Thread.currentThread().getName()+"----"+Single2.getSingle().hashCode());

    }
}
