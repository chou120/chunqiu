package com.banyuan.threadSetAndGet;

import java.util.Random;

public class SetCakeThread extends Thread {

    private Cake cake;
    int i = 1;

    public SetCakeThread(Cake cake) {
        this.cake = cake;
    }


    @Override
    public void run() {
        boolean  flag=true;
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (cake) {
                if (flag) {
                        cake.name = "月兔";
                        cake.type = "水果";
                        flag=!flag;
                    } else {
                        cake.name = "嫦娥";
                        cake.type = "煎饼果子";
                        flag=!flag;

                }
                cake.notify();
                try {
                    cake.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
