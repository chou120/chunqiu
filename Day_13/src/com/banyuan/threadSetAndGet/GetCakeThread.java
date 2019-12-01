package com.banyuan.threadSetAndGet;

import java.util.Random;

public class GetCakeThread extends Thread {

    private Cake cake;

    public GetCakeThread(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (cake) {
                if(cake.name!=null && cake.type!=null) {
                    System.out.println(Thread.currentThread().getName() + "---" + cake.name + ",类型:" + cake.type);
                }
                cake.notify();  //唤醒生产蛋糕的线程
                
                try {
                    cake.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

    }
}
}
