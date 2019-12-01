package com.banyuan.cn;

import java.util.Random;

public class PersonB extends Thread {

    Mythread mt;

    public PersonB(Mythread mt) {
        this.mt = mt;
    }

    @Override
    public void run() {


        while (true) {

            try {
                Thread.sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (mt) {
                if (mt.money >= 200) {
                    mt.getMoneyB(200);
                } else {
                    break;
                }
            }


        }


    }


}
