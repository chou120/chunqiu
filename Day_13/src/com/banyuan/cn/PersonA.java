package com.banyuan.cn;

import java.util.Random;

public class PersonA extends Thread {

    Mythread mt;

    public PersonA(Mythread mt) {
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
                if (mt.money >= 100) {
                    mt.getMoneyA(100);

                } else {
                    break;
                }

            }

        }
    }
}