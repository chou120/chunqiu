package com.banyuan.homework;

public class Test {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {

        Tools   t=new Tools();
        MyThread1  mt1=new MyThread1(t);
        MyThread2  mt2=new MyThread2(t);
        MyThread3  mt3=new MyThread3(t);
        NotifyThread nt=new NotifyThread(t);


        mt1.start();
        mt2.start();
        mt3.start();
        nt.start();



    }

}
