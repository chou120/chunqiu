package com.banyuan.thread3;

public class ThreadSleep  extends  Thread{

    public ThreadSleep(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+"----"+i);
//            try {
//                Thread.sleep(3000);  //当第一个线程执行到此步骤的时候   睡眠3秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            //Thread.yield();//线程让步   把当前的资源让出来  暂停当前资源并且执行后面资源

        }
    }
}
