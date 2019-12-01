package com.banyuan.threadDemo6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread   extends    Thread{

    /**
     * jdk 5以后    给 Lock 锁
     */
        int  ticket=100;
        Lock   lock=new ReentrantLock();
        int  i=0;

        boolean  flag;

        public void setFlag(boolean flag) {
                this.flag = flag;
        }

    @Override
    public void run() {

        if(flag){
                synchronized (Tools.o1) {

                    System.out.println(Thread.currentThread().getName()+"抢到资源"+"--------------++++++++");
                        synchronized (Tools.o2) {
                            System.out.println(Thread.currentThread().getName()+"抢到资源");
                        }


                }
        } else{
                synchronized (Tools.o2) {

                    System.out.println(Thread.currentThread().getName()+"抢到资源"+"---------");

                        synchronized (Tools.o1) {
                            System.out.println(Thread.currentThread().getName() + "抢到了资源");

                        }



                }
            }


        }
    }


